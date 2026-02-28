class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public void showBug() {
        System.out.println(bar);
    }

    public void addMutant() {
        boolean condition = false; // a compile-time constant that makes the for loop unreachable
        if (condition) {
            for (int i = 0; i < 5; i++) {
                System.out.println("This mutant code is unreachable in the original code");
            }
        }
    }
}