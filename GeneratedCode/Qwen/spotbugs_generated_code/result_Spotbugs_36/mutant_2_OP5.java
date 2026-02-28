class ConfusionExample {

    // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION) 
    public void ConfusionExample() {
        System.out.println("This is not a constructor!");

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                System.out.println("This switch case is unreachable.");
                break;
            case 1:
                // This is the reachable case
                break;
        }
    }

    public ConfusionExample(String message) {
        System.out.println("This is the actual constructor: " + message);
    }

    public String showBug() {
        ConfusionExample(); // Calling the method that looks like a constructor
        return "Check the console for the bug demonstration.";
    }

    public static void main(String[] args) {
        ConfusionExample example = new ConfusionExample("Hello");
        example.showBug();
    }

    private boolean getCondition() {
        // This method always returns false, making the switch case 0 unreachable
        return false;
    }
}