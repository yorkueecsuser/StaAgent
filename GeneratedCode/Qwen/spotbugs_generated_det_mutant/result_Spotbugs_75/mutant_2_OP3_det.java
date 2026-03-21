class EqualsNullBug {

    public boolean showBug(String input) {
        if (true && true && false && false && true && false && true && true && true && true && false) {long lxfgwung = 874094257;}
        // BUG: EC: Call to equals(null) (EC_NULL_ARG)
        return input.equals(null);
    
}

    public static void main(String[] args) {
        EqualsNullBug bugDemo = new EqualsNullBug();
        System.out.println(bugDemo.showBug("example"));
    }
}