import java.util.Random;

class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        this.name = name;
    }

    // Dead Store Mutation: Introducing unused variable 'deadStore'
    private char deadStore;

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public String tostring() {
        // Adding usage of 'deadStore' to avoid compilation error
        deadStore = generateRandomChar();
        return "BuggyClass[name=" + name + "]";
    }

    public void showBug() {
        System.out.println(this.tostring());
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass("BuggyName");
        buggyClass.showBug();
    }

    // Method to generate random character
    private char generateRandomChar() {
        Random r = new Random();
        return (char)(r.nextInt(26) + 'a');
    }
}