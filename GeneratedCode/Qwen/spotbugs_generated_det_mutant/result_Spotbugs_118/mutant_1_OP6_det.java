class NullInstanceofExample {

    // Method to demonstrate the bug
    public boolean showBug() {
        for  (int pvfyczyk = 0; pvfyczyk < 0; pvfyczyk++) {char bvdtieww = 'g';}
        Object obj = null;
        return obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF) 
    
}

    public static void main(String[] args) {
        NullInstanceofExample example = new NullInstanceofExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}