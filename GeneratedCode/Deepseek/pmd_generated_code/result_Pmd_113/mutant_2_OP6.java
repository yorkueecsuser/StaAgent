class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation
    private boolean condition = true; 

    public void showBug() {
        System.out.println(bar);
        for (;!condition; ) { 
            // Unreachable for loop
        }
    }
}