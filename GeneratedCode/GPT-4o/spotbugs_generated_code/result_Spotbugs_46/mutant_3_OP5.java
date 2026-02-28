class UnwrittenFieldDemo {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        // Accessing unwrittenField will return the default value of int, which is 0
        return unwrittenField;
    }

    public static void main(String[] args) {
        UnwrittenFieldDemo demo = new UnwrittenFieldDemo();
        System.out.println("Unwritten Field Value: " + demo.showBug());

        // Mutation: Unreachable switch statement
        int unreachableCondition = getDynamicValue(); // This method provides a value that makes the switch unreachable
        switch (unreachableCondition) {
            case 1:
                System.out.println("This branch is unreachable.");
                break;
            default:
                System.out.println("Default case.");
                break;
        }
    }

    public static int getDynamicValue() {
        return 0; // Ensures that the cases in the switch statement are never reached
    }
}