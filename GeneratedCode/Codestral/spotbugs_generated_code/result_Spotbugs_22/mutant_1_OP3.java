class ClassComparisonBug {
    private String name;

    public ClassComparisonBug(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This line should never be executed");
        }
        return this.getClass().getName().equals(obj.getClass().getName());
    }

    private boolean getUnreachableCondition() {
        // This method always returns false
        return false;
    }

    public String getName() {
        return name;
    }

    public void showBug(Object obj) {
        System.out.println("Are the objects equal? " + this.equals(obj));
    }

    public static void main(String[] args) {
        // Same as before
    }
}