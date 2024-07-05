import java.util.List;

public class Municipality {
    private String name;
    private List<Place> towns;

    public Municipality(String name, List<Place> places) {
        this.name = name;
        this.towns = places;
    }

    public Municipality(String municipalityName) {
        this.name = municipalityName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Place> getTowns() {
        return towns;
    }

    public void setTowns(List<Place> towns) {
        this.towns = towns;
    }

}
