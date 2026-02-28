import java.util.Random;

class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        this.name = name;
    }

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public String tostring() {
        // Mutation: Dead Store
        String deadVariable = generateRandomString(8);
        return "BuggyClass[name=" + name + "]";
    }

    // Utility method to generate a random string
    public static String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();
        while (length > 0) {
            result.append(characters.charAt(rnd.nextInt(characters.length())));
            length--;
        }
        return result.toString();
    }

    public void showBug() {
        System.out.println(this.tostring()); // This will not be printed as expected.
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass("BuggyName");
        buggyClass.showBug();
    }
}