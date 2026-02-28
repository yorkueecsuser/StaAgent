import java.io.Serializable;

class BuggySingleton implements Serializable {
    private static BuggySingleton instance = null;

    private String value;

    private BuggySingleton() {
        value = "Hello, World!";
    }

    public static BuggySingleton getInstance() {
        if (instance == null) {
            instance = new BuggySingleton();
        }
        return instance;
    }

    public String getValue() {
        return value;
    }

    // Mutation Operator: Dead Store
    // Description: Inserting unused variable declarations with one primitive type (for example string, int) to a randomly selected basic block in the program. The name of the variable is a string of eight characters randomly generated in the form of [a-z]. Only one dead store is added in each transformation by this operator.

    private boolean isInitialized = false;
    private int deadStore = 0;

    public void initialize() {
        deadStore = 1;
        isInitialized = true;
    }
}