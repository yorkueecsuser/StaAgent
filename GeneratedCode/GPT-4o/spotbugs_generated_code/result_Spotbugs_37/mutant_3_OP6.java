class HashCodeExample {

    private String value;

    public HashCodeExample(String value) {
        this.value = value;
    }
    
    // Incorrectly named method that looks similar to hashCode
    public int hashcode() {  // BUG: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
        return value.length();
    }

    // Method to demonstrate the bug
    public int showBug() {
        // Creating an instance of the class
        HashCodeExample example = new HashCodeExample("example");

        // Inserting an unreachable for loop
        boolean runLoop = getFalseCondition();
        for (int i = 0; runLoop; i++) {
            // This block is unreachable
            System.out.println("This is unreachable code.");
        }
        
        // Calling the incorrectly named hashcode method
        // This will return the result from the misnamed method
        return example.hashcode();
    }

    // Method to provide a false condition dynamically
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        HashCodeExample obj = new HashCodeExample("test");
        System.out.println("Result from showBug: " + obj.showBug());
    }
}