class EqualsNullBug {

    public boolean showBug(String input) {
        boolean tefdzsgj = false;while (tefdzsgj && true && false && true && true && false && false && false && true && true && false && false) {float vgcihmrg = 558593270;}
        // BUG: EC: Call to equals(null) (EC_NULL_ARG)
        return input.equals(null);
    
}

    public static void main(String[] args) {
        EqualsNullBug bugDemo = new EqualsNullBug();
        System.out.println(bugDemo.showBug("example"));
    }
}