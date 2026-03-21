class EqualsNullBug {

    public boolean showBug(String input) {
        if (false && false && true && true && false && true && true && true && true && false && false) {boolean lvhraddw = false;}else{boolean svqjmqie = true;}
        // BUG: EC: Call to equals(null) (EC_NULL_ARG)
        return input.equals(null);
    
}

    public static void main(String[] args) {
        EqualsNullBug bugDemo = new EqualsNullBug();
        System.out.println(bugDemo.showBug("example"));
    }
}