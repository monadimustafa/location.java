import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Location> locations = new HashMap<>();
        Location l1 = new Location(1,"zone1");
        Location l2 = new Location(2,"zone2");
        Location l3 = new Location(3,"zone3");
        Location l4 = new Location(4,"zone4");
        Location l5 = new Location(5,"zone5");
        Map<String,Integer> ExitZone1 = new HashMap<>();
        ExitZone1.put("Nord",1);
        Map<String,Integer> ExitZone2 = new HashMap<>();
        ExitZone2.put("Nord",1);
        Map<String,Integer> ExitZone3 = new HashMap<>();
        ExitZone3.put("Est",1);
        Map<String,Integer> ExitZone4 = new HashMap<>();
        ExitZone4.put("Ouest",1);
        Map<String,Integer> ExitZone5 = new HashMap<>();
        ExitZone5.put("Nord",1);
        l1.setExits(ExitZone1); l2.setExits(ExitZone2); l3.setExits(ExitZone3);
        l4.setExits(ExitZone4); l5.setExits(ExitZone5);
        locations.put(1,l1);locations.put(2,l2);locations.put(3,l3);locations.put(4,l4);
        locations.put(5,l5);
        System.out.println("location ou Position:");
        Scanner sc = new Scanner(System.in);
        String loc = sc.nextLine();
        for(int i=1; i<locations.size()+1;i++){
            if((locations.get(i).description).equals(loc)){
                System.out.println(locations.get(i).getExits());
            }
            else if((locations.get(i).getExits()).equals(loc)){
                System.out.println(locations.get(i).getDescription());
            }
        }
            }
}