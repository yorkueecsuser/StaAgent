class EqualsNullBug {

    public boolean showBug(String input) {
        // BUG: EC: Call to equals(null) (EC_NULL_ARG) 
        return input.equals(null);
    }

    public static void main(String[] args) {
        EqualsNullBug bugDemo = new EqualsNullBug();
        String x = "example";
        System.out.println(bugDemo.showBug(x));
    }
}