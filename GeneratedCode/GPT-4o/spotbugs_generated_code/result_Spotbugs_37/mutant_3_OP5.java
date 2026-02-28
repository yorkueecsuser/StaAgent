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
        
        // Inserting unreachable switch statement
        int constantValue = getValue();
        switch (constantValue) {
            case 999:  // This case will never be reached
                System.out.println("Unreachable case reached");
                break;
        }
        
        // Calling the incorrectly named hashcode method
        // This will return the result from the misnamed method
        return example.hashcode();
    }

    private int getValue() {
        return 0;  // Always returns 0, making the switch case unreachable
    }

    public static void main(String[] args) {
        HashCodeExample obj = new HashCodeExample("test");
        System.out.println("Result from showBug: " + obj.showBug());
    }
}