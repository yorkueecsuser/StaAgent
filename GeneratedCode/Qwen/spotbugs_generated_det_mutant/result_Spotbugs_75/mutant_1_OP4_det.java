class EqualsNullBug {

    public boolean showBug(String input) {
        if (true && false && false && true && false && false && true && false && false && true && false) {boolean zlxzvnsm = true;}else{boolean mjfsuxsk = false;}
        // BUG: EC: Call to equals(null) (EC_NULL_ARG)
        return input.equals(null);
    
}

    public static void main(String[] args) {
        EqualsNullBug bugDemo = new EqualsNullBug();
        System.out.println(bugDemo.showBug("example"));
    }
}