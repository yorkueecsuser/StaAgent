class GetClassOnClassExample {

    public String showBug() {
        Class<?> clazz = String.class;
        // BUG: GetClassOnClass
        String className = clazz.getClass().getName(); // This mistakenly gets the name for java.lang.Class
        
        // Introduce unreachable if statement using a dynamically determined condition
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This is an unreachable branch.");
        }
        
        return className;
    }
    
    // Method to ensure the condition is determined at runtime
    private boolean getFalseCondition() {
        return false; // This method returns false, but it is not a compile-time constant
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println("Class name obtained: " + example.showBug());
    }
}