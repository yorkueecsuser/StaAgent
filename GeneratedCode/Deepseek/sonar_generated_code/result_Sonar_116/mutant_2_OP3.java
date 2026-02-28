import java.io.IOException;

class MutableInstanceFieldBug {
    private String mutableField = "This is a mutable field";

    public void doGet() {
        System.out.println("Hello, world!");
    }

    public String showBug() {
        boolean condition = false; // Mutant 1: Using a variable for a compile-time constant
        if (condition) {
            mutableField = "This is a mutable field that has been changed"; 
        }

        boolean conditionWhile = false; // Mutant 2: Using a variable for a compile-time constant in a while loop
        while (conditionWhile) {
            // Do nothing
        }

        boolean conditionFor = false; // Mutant 3: Using a variable for a compile-time constant in a for loop
        for (int i = 0; conditionFor; i++) {
            // Do nothing
        }

        boolean shouldRun = false; // Mutant 4: Using a variable for a compile-time constant in an if-else statement
        if (shouldRun) {
            // Do nothing
        }
        else {
            // Do nothing
        }

        int value = 0; // Mutant 5: Using a variable for a compile-time constant in a switch statement
        switch(value) {
            case 1: // Do nothing
        }

        return mutableField;
    }
}