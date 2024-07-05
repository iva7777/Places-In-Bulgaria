import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(name, region.name) && Objects.equals(municipalities, region.municipalities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, municipalities);
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", municipalities=" + municipalities +
                '}';
    }
}
