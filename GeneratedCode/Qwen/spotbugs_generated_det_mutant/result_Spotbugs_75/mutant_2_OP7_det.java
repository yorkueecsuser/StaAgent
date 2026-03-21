class EqualsNullBug {

    public boolean showBug(String input) {
        boolean mhxohfer = false;while (mhxohfer && true && true && true && false && false && false && true && false && false && false && false) {short hkhezhen = 8448;}
        // BUG: EC: Call to equals(null) (EC_NULL_ARG)
        return input.equals(null);
    
}

    public static void main(String[] args) {
        EqualsNullBug bugDemo = new EqualsNullBug();
        System.out.println(bugDemo.showBug("example"));
    }
}