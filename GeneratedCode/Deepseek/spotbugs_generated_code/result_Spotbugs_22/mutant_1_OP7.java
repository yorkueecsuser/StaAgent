class ClassComparisonBug {
    private String name;

    public ClassComparisonBug(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        boolean unreachableLoopCondition = false;
        while (unreachableLoopCondition) {
            // This loop is unreachable and will not be executed
            System.out.println("Unreachable loop executed");
        }
        return this.getClass().getName().equals(obj.getClass().getName());
    }

    public String getName() {
        return name;
    }

    public void showBug(Object obj) {
        System.out.println("Are the objects equal? " + this.equals(obj));
    }

    public static void main(String[] args) {
        // The rest of the main method and class loader sections remain the same
    }
}