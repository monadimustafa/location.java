import java.util.HashMap;
import java.util.Map;

public class Location {
    int idLocation;
    String description;
    Map<String,Integer> exits = new HashMap<>();

    @Override
    public String toString() {
        return idLocation+" "+description;
    }
    public Location(int idLocation, String description) {
        this.idLocation = idLocation;
        this.description = description;
        this.exits = new HashMap<>(exits);
    }

    public int getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(int idLocation) {
        this.idLocation = idLocation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }

    public void setExits(Map<String, Integer> exits) {
        this.exits = new HashMap<>(exits);
    }

}
