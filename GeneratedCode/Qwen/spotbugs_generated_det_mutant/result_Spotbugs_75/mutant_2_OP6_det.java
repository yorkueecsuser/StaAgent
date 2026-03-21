class EqualsNullBug {

    public boolean showBug(String input) {
        for  (int aerdfkzv = 0; aerdfkzv < 0; aerdfkzv++) {boolean xktapjtj = true;}
        // BUG: EC: Call to equals(null) (EC_NULL_ARG)
        return input.equals(null);
    
}

    public static void main(String[] args) {
        EqualsNullBug bugDemo = new EqualsNullBug();
        System.out.println(bugDemo.showBug("example"));
    }
}