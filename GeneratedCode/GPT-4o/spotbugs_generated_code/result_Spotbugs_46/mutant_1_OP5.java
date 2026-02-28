class UnwrittenFieldDemo {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        // Accessing unwrittenField will return the default value of int, which is 0
        return unwrittenField;
    }

    private boolean alwaysFalse() {
        return false;
    }

    public void demonstrateMutation() {
        int unreachableValue = 3;
        // Inserting unreachable switch statement
        switch (unreachableValue) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            case 2:
                System.out.println("This code is also unreachable");
                break;
            default:
                if (alwaysFalse()) { // This will always be false
                    System.out.println("Unreachable default case");
                }
        }
    }

    public static void main(String[] args) {
        UnwrittenFieldDemo demo = new UnwrittenFieldDemo();
        System.out.println("Unwritten Field Value: " + demo.showBug());
        demo.demonstrateMutation(); // Call to demonstrate mutation
    }
}