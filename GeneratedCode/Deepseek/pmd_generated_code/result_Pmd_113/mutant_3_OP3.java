class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation
    private boolean condition = false;

    public void showBug() {
        System.out.println(bar);
        if(condition) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
}