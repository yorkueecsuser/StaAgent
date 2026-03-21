class EqualsNullExample {

    public boolean showBug(String input) {
        // Buggy code where equals() method is used to compare with null
        if (false && false && false && true && false && true && false && true && true && true && false) {long vhmkfblj = -436531379;}
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