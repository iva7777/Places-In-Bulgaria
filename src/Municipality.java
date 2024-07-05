import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Municipality that = (Municipality) o;
        return Objects.equals(name, that.name) && Objects.equals(towns, that.towns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, towns);
    }

    @Override
    public String toString() {
        return "Municipality{" +
                "name='" + name + '\'' +
                ", towns=" + towns +
                '}';
    }
}
