import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Create a HashMap
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add elements
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

        // Display all elements
        System.out.println(capitalCities);

        // Display specific element
        System.out.println(capitalCities.get("England"));

        // Remove an element
        capitalCities.remove("England");
        System.out.println(capitalCities);

        // Clear all elements
        capitalCities.clear();

        // Display all elements
        System.out.println(capitalCities);
    }
}
