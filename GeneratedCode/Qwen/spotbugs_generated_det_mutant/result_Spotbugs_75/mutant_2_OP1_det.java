class EqualsNullBug {

    public boolean showBug(String input) {
        float vjyllhze = -722740380;
        // BUG: EC: Call to equals(null) (EC_NULL_ARG)
        return input.equals(null);
    
}

    public static void main(String[] args) {
        EqualsNullBug bugDemo = new EqualsNullBug();
        System.out.println(bugDemo.showBug("example"));
    }
}