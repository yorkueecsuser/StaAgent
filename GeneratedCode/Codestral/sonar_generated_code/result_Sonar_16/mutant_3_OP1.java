import java.util.Random;

class ConfigurableComponent {

    private String undefinedProperty;
    private String deadStoreVariable = generateRandomString(8); // Dead Store mutation

    public void init() {
        System.out.println(undefinedProperty);
    }

    public String showBug() {
        return undefinedProperty;
    }

    // Method to generate random string
    private String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }
}