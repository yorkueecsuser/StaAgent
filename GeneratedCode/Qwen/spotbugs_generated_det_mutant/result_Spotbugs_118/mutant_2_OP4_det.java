class NullInstanceofExample {

    // Method to demonstrate the bug
    public boolean showBug() {
        if (false && true && true && false && false && false && true && true && false && true && false) {long gmkarmqc = 699065438;}else{int iphjkfef = 569111368;}
        Object obj = null;
        return obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF) 
    
}

    public static void main(String[] args) {
        NullInstanceofExample example = new NullInstanceofExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}