class HashCodeExample {

    private String value;

    public HashCodeExample(String value) {
        this.value = value;
    }
    
    // Incorrectly named method that looks similar to hashCode
    public int hashcode() {  // BUG: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
        return value.length();
    }

    // Method to demonstrate the bug
    public int showBug() {
        // Creating an instance of the class
        HashCodeExample example = new HashCodeExample("example");
        
        // Inserting an unreachable for loop
        boolean conditionFor = getConditionFor();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line is unreachable.");
        }
        
        // Calling the incorrectly named hashcode method
        // This will return the result from the misnamed method
        return example.hashcode();
    }
    
    // A method to ensure the for loop condition is not a compile-time constant
    private boolean getConditionFor() {
        return false; // Set to false to make the loop unreachable
    }

    public static void main(String[] args) {
        HashCodeExample obj = new HashCodeExample("test");
        System.out.println("Result from showBug: " + obj.showBug());
    }
}