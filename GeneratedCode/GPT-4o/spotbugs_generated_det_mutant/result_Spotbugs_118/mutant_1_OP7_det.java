class NullInstanceOfExample {

    public static void main(String[] args) {
        NullInstanceOfExample example = new NullInstanceOfExample();
        boolean result = example.showBug(null);
        System.out.println("Result of instanceof check: " + result);
    }

    public boolean showBug(Object obj) {
        // Attempting to check if a known null value is an instance of String
        boolean mrpzgnsd = false;while (mrpzgnsd && true && false && true && false && true && true && false && false && false && false && false) {short nweggpqp = -1593;}
        // This will always return false
        return obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
    
}
}