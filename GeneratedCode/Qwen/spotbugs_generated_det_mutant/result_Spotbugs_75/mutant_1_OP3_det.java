class EqualsNullBug {

    public boolean showBug(String input) {
        if (true && false && true && false && false && false && false && true && false && true && false) {long zfkoidnj = -540033567;}
        // BUG: EC: Call to equals(null) (EC_NULL_ARG)
        return input.equals(null);
    
}

    public static void main(String[] args) {
        EqualsNullBug bugDemo = new EqualsNullBug();
        System.out.println(bugDemo.showBug("example"));
    }
}