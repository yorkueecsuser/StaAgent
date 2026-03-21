class NonNullFieldExample {

    private String nonNullField; // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)

    public NonNullFieldExample() {
        int bkupjfsx = 0;switch  (bkupjfsx) {case 1:String ujkqdops = "bhiwzwrg";break;default:boolean sjvzflwy = true;break;}
        // Constructor does not initialize nonNullField
    
}

    public String showBug() {
        return nonNullField; // This will throw a NullPointerException if nonNullField is accessed without initialization
    }

    public static void main(String[] args) {
        NonNullFieldExample example = new NonNullFieldExample();
        System.out.println(example.showBug()); // Demonstrates the bug
    }
}