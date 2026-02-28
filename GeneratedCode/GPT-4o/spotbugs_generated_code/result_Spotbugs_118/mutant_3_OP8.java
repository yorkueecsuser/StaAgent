class NullInstanceOfExample {

    public static void main(String[] args) {
        NullInstanceOfExample a = new NullInstanceOfExample();
        boolean b = a.showBug(null);
        System.out.println("Result of instanceof check: " + b);
    }

    public boolean showBug(Object obj) {
        // Attempting to check if a known null value is an instance of String
        // This will always return false
        return obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
    }
}