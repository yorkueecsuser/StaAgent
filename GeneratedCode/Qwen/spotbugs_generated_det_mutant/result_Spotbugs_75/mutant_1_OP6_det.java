class EqualsNullBug {

    public boolean showBug(String input) {
        for  (int vymnqkmb = 0; vymnqkmb < 0; vymnqkmb++) {long vuvzorhk = 784919796;}
        // BUG: EC: Call to equals(null) (EC_NULL_ARG)
        return input.equals(null);
    
}

    public static void main(String[] args) {
        EqualsNullBug bugDemo = new EqualsNullBug();
        System.out.println(bugDemo.showBug("example"));
    }
}