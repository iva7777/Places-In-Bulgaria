import java.util.ArrayList;
import java.util.List;

public class Region {
    private String name;
    private List<Municipality> municipalities;

    public Region(String regionName, List<Municipality> municipalities) {
        this.name = regionName;
        this.municipalities = municipalities;
    }

    public Region(String regionName) {
        this(regionName, new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Municipality> getMunicipalities() {
        return municipalities;
    }

    public void setMunicipalities(List<Municipality> municipalities) {
        this.municipalities = municipalities;
    }

    public Place findPlaceByPostalCode(String postalCode){
        for (Municipality m : municipalities){
            for (Place p : m.getTowns()){
                if (p.getPhoneCode().equals(postalCode)){
                    return p;
                }
            }
        }
        return null;
    }
}
