class NullFieldExample {
    
    private String alwaysNull; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        alwaysNull = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    }
    
    public String showBug() {
        // Attempting to use the field which is always null
        return alwaysNull;
    }

    public static void main(String[] b) { // Variable renamed from 'args' to 'b'
        NullFieldExample c = new NullFieldExample(); // Variable renamed from 'example' to 'c'
        System.out.println("The value of alwaysNull is: " + c.showBug());
    }
}