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

        // Added loop for mutation
        int i = 0;
        while (i < 1) {
            System.out.println("Loop iteration: " + i);
            i++;
        }

        return "Check the console for the bug demonstration.";
    }

    public static void main(String[] args) {
        ConfusionExample example = new ConfusionExample("Hello");
        example.showBug();
    }
}