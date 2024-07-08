import java.util.List;
import java.util.stream.Collectors;

public class PlaceService {
    private List<Municipality> municipalities;

    public PlaceService(List<Municipality> municipalities) {
        this.municipalities = municipalities;
    }

    public List<Place> findPlacesByPostalCode(String postalCode) {
        return municipalities.stream().flatMap(m -> m.getTowns().stream())
                .filter(p -> p.getPostCodes().stream().anyMatch(code -> code.equals(postalCode)))
                .collect(Collectors.toList());
    }
}
