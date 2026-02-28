class HashCodeExample {

    private String a; // Renamed variable 'value' to 'a'

    public HashCodeExample(String a) { // Updated constructor parameter 'value' to 'a'
        this.a = a;
    }
    
    // Incorrectly named method that looks similar to hashCode
    public int hashcode() {  // BUG: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
        return a.length();
    }

    // Method to demonstrate the bug
    public int showBug() {
        // Creating an instance of the class
        HashCodeExample b = new HashCodeExample("example"); // Renamed variable 'example' to 'b'
        
        // Calling the incorrectly named hashcode method
        // This will return the result from the misnamed method
        return b.hashcode();
    }

    public static void main(String[] c) {  // Renamed variable 'args' to 'c'
        HashCodeExample d = new HashCodeExample("test"); // Renamed variable 'obj' to 'd'
        System.out.println("Result from showBug: " + d.showBug());
    }
}