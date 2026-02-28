import java.util.Random;

class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        String result = unwrittenField.toLowerCase(); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        System.out.println(result);

        // Mutant code: Dead Store
        // Inserting unused variable declaration with a primitive type
        String deadStore = generateRandomString(8);
    }

    private String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        while(length > 0) {
            result.append(characters.charAt(random.nextInt(characters.length())));
            length--;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}