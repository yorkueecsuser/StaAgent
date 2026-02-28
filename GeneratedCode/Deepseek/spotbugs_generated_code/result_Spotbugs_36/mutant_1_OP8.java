import java.util.Random;

class ApparentMethodConstructorConfusionBug {
    // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
    public void ApparentMethodConstructorConfusionBug(String input) {
        System.out.println("This method is intended to be a constructor but was mistakenly defined as a regular method.");
        System.out.println("Input received: " + input);
    }

    public void showBug(String input) {
        ApparentMethodConstructorConfusionBug(input); // Calling the buggy method
    }

    // Mutant
    public void showMutant(String input) {
        Random rand = new Random();
        String inputRenamed = input + rand.nextInt(100);
        ApparentMethodConstructorConfusionBug(inputRenamed); // Calling the buggy method with renamed variable
    }
}