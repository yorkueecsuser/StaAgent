import java.util.*; // maintaining original import statements

class ApparentMethodConstructorConfusionBug {
    // original buggy method
    public void ApparentMethodConstructorConfusionBug(String input) {
        System.out.println("This method is intended to be a constructor but was mistakenly defined as a regular method.");
        System.out.println("Input received: " + input);
    }

    public void showBug(String input) {
        ApparentMethodConstructorConfusionBug(input); // Calling the buggy method
    }

    // mutated code: renaming a variable that is not directly related to the bug
    public void displayOutput(String msg) {
        System.out.println("Displaying output: " + msg);
    }

    public void showMutant(String input) {
        displayOutput(input); // Calling the mutated method
    }
}