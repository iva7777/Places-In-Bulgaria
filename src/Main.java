import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegionContainer regionContainer = new RegionContainer(new ArrayList<>());

        try(InputStream inputStream = Main.class.getResourceAsStream("file/transformed-places.json")) {
            if (inputStream == null) {
                throw new IOException("Unable to find file");
            }

            StringBuilder content = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            String json = content.toString();
            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();

            Gson gson = builder.create();
            regionContainer = gson.fromJson(json, RegionContainer.class);


        } catch (IOException e) {
            e.printStackTrace();
        }


        if (!regionContainer.getRegions().isEmpty()) {
            List<Municipality> municipalities = regionContainer.getRegions().getFirst().getMunicipalities();
            PlaceService service = new PlaceService(municipalities);

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Въведи пощенски код за проверка или 'изход' за излизане от програмата:");
                String postalCodeToFind = scanner.nextLine();
                if (postalCodeToFind.equalsIgnoreCase("изход")) {
                    System.out.println("Изход от програмата.");
                    break;
                }

                List<Place> foundPlaces = service.findPlacesByPostalCode(postalCodeToFind);

                if (!foundPlaces.isEmpty()) {
                    for (Place place : foundPlaces) {
                        System.out.println("Намерено населено място " + place.getName() + " с пощенски код " + postalCodeToFind);
                    }
                } else {
                    System.out.println("Няма населено място с такъв пощенски код " + postalCodeToFind);
                }
            }
        }
    }
}
