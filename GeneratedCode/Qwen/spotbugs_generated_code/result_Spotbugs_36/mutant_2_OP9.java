class ConfusionExample {

    // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION) 
    public void ConfusionExample() {
        System.out.println("This is not a constructor!");
    }

    public ConfusionExample(String message) {
        System.out.println("This is the actual constructor: " + message);
    }

    public String showBug() {
        ConfusionExample(); // Calling the method that looks like a constructor

        // Unique mutant: A do-while loop that does not affect the existing functionality
        int i = 0;
        do {
            if (i == 0) {
                System.out.println("This is a unique mutant do-while loop.");
            }
            i++;
        } while (i < 1);

        return "Check the console for the bug demonstration.";
    }

    public static void main(String[] args) {
        ConfusionExample example = new ConfusionExample("Hello");
        example.showBug();
    }
}