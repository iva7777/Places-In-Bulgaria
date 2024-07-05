import java.util.List;
import java.util.Objects;

public class Place {
    private String id;
    private String name;
    private String type;
    private String townHall;
    private String phoneCode;
    private double latitude;
    private double longitude;
    private List<String> postCodes;


    public Place(String id, String name, String type, String townHall, String phoneCode, double latitude, double longitude, List<String> postCodes) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.townHall = townHall;
        this.phoneCode = phoneCode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.postCodes = postCodes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTownHall() {
        return townHall;
    }

    public void setTownHall(String townHall) {
        this.townHall = townHall;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public List<String> getPostCodes() {
        return postCodes;
    }

    public void setPostCodes(List<String> postCodes) {
        this.postCodes = postCodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return Double.compare(latitude, place.latitude) == 0 && Double.compare(longitude, place.longitude) == 0 && Objects.equals(id, place.id) && Objects.equals(name, place.name) && Objects.equals(type, place.type) && Objects.equals(townHall, place.townHall) && Objects.equals(phoneCode, place.phoneCode) && Objects.equals(postCodes, place.postCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, townHall, phoneCode, latitude, longitude, postCodes);
    }

    @Override
    public String toString() {
        return "Place{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", townHall='" + townHall + '\'' +
                ", phoneCode='" + phoneCode + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", postCodes=" + postCodes +
                '}';
    }
}
