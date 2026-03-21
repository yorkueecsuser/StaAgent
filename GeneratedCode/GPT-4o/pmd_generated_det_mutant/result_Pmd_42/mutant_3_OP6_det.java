class EqualsNullExample {

    public boolean showBug(String input) {
        // Buggy code where equals() method is used to compare with null
        for  (int zouwbvlw = 0; zouwbvlw < 0; zouwbvlw++) {String xmgrvvke = "kghbaywd";}
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        }
        return false;
    
}
    
    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        boolean result = example.showBug(null);
        System.out.println("Result: " + result);
    }
}