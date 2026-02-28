import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class MapComputeBug {

    public Map<String, String> showBug(String key) {
        Map<String, String> map = new HashMap<>();

        // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        map.computeIfAbsent(key, k -> null);

        // Mutant: Dead Store
        String mutantVar = generateRandomString(8);

        return map;
    }

    private String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();

        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(rnd.nextInt(characters.length())));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        MapComputeBug bug = new MapComputeBug();
        Map<String, String> result = bug.showBug("key");
        System.out.println(result);
    }
}