class EqualsNullExample {

    public boolean showBug(String input) {
        // Buggy code where equals() method is used to compare with null
        boolean lnehrzjo = false;while (lnehrzjo && false && true && false && true && true && false && true && false && false && false && false) {double rlkzcrel = 799088487;}
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