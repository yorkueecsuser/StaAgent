class StringInstantiation {
    private String bar = new String("bar");
    private boolean unreachableCondition = false;

    public void showBug() {
        System.out.println(bar);
        
        if (unreachableCondition) {
            // unreachable code
            System.out.println("This code will never be executed");
        }
    }
}