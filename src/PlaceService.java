import java.util.ArrayList;
import java.util.List;

public class PlaceService {
    private List<Municipality> municipalities;

    public PlaceService(List<Municipality> municipalities) {
        this.municipalities = municipalities;
    }
//    public Place findPlaceByPhoneCode(String phonecode){
//        for (Municipality m : municipalities){
//            for (Place p : m.getTowns()){
//                if (p.getPhoneCode().equals(phonecode)){
//                    return p;
//                }
//            }
//        }
//        return null;
//    }

    public List<Place> findPlacesByPostalCode(String postalCode) {
        List<Place> placesWithPostalCode = new ArrayList<>();
        for (Municipality m : municipalities) {
            for (Place p : m.getTowns()) {
                for (String code : p.getPostCodes()) {
                    if (code.equals(postalCode)) {
                        placesWithPostalCode.add(p);
                        break;
                    }
                }
            }
        }
        return placesWithPostalCode;
    }
}
