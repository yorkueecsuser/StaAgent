class HashCodeExample {

    private String v; // Renamed variable from 'value' to 'v'

    public HashCodeExample(String v) { // Renamed parameter from 'value' to 'v'
        this.v = v; // Adjusted assignment due to renaming
    }
    
    // Incorrectly named method that looks similar to hashCode
    public int hashcode() {  // BUG: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
        return v.length(); // Adjusted due to renaming
    }

    // Method to demonstrate the bug
    public int showBug() {
        // Creating an instance of the class
        HashCodeExample e = new HashCodeExample("example"); // Renamed variable from 'example' to 'e'
        
        // Calling the incorrectly named hashcode method
        // This will return the result from the misnamed method
        return e.hashcode(); // Adjusted due to renaming
    }

    public static void main(String[] args) {
        HashCodeExample o = new HashCodeExample("test"); // Renamed variable from 'obj' to 'o'
        System.out.println("Result from showBug: " + o.showBug()); // Adjusted due to renaming
    }
}