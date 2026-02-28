class GetClassOnClassExample {

    public String showBug() {
        Class<?> clazz = String.class;
        // BUG: GetClassOnClass
        String className = clazz.getClass().getName(); // This mistakenly gets the name for java.lang.Class

        // Introduce a non-final variable to ensure the condition is not a compile-time constant
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        }

        return className;
    }

    // Method to provide a non-constant false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println("Class name obtained: " + example.showBug());
    }
}