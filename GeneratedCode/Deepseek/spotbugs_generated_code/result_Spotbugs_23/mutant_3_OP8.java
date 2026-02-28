import java.util.Random;

class AlwaysTrueClass {
    private String value;
    private Random rnd; // Mutant: Renaming user-defined variable

    public AlwaysTrueClass(String val) {
        this.value = val;
        this.rnd = new Random(); // Initialize mutant variable
    }

    @Override
    public boolean equals(Object obj) {
        // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
        return true;
    }

    public String getValue() {
        return value;
    }

    public void showBug(AlwaysTrueClass altObj) { // Mutant: Renaming user-defined variable
        if (this.equals(altObj)) {
            System.out.println("Bug demonstrated: Both objects are considered equal");
        }
        int randomNumber = rnd.nextInt(100); // Use mutant variable
        System.out.println("Random number: " + randomNumber);
    }
}