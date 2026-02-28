class UnwrittenFieldDemo {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        // Accessing unwrittenField will return the default value of int, which is 0
        // Inserted unreachable switch statement
        int unreachableVariable = getUnreachableValue();
        switch(unreachableVariable) {
            case 1:
                System.out.println("This will never print.");
                break;
        }
        
        return unwrittenField;
    }

    private int getUnreachableValue() {
        // Always returns a value that is not 1
        return 0; 
    }

    public static void main(String[] args) {
        UnwrittenFieldDemo demo = new UnwrittenFieldDemo();
        System.out.println("Unwritten Field Value: " + demo.showBug());
    }
}