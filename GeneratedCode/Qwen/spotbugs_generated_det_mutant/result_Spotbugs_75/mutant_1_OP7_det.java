class EqualsNullBug {

    public boolean showBug(String input) {
        boolean eheooqth = false;while (eheooqth && false && true && false && false && true && false && true && true && false && false && false) {byte qzoltihx = -114;}
        // BUG: EC: Call to equals(null) (EC_NULL_ARG)
        return input.equals(null);
    
}

    public static void main(String[] args) {
        EqualsNullBug bugDemo = new EqualsNullBug();
        System.out.println(bugDemo.showBug("example"));
    }
}