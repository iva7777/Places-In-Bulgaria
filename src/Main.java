import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Municipality> municipalities = new ArrayList<>();
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

        String postalCodeToFind = "074406";
        Place toFound = regionContainer.getRegions().getFirst().findPlaceByPostalCode(postalCodeToFind);
        if (toFound != null) {
            System.out.println("Намерено населено място: " + toFound.getName());
        } else {
            System.out.println("Населено място с пощенски код " + postalCodeToFind + " не е намерено.");
        }
    }
}
