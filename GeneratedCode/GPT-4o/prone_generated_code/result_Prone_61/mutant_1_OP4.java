class GetClassOnClassExample {

    public String showBug() {
        Class<?> clazz = String.class;
        // BUG: GetClassOnClass
        String className = clazz.getClass().getName(); // This mistakenly gets the name for java.lang.Class
        
        // Inserting unreachable if-else statement
        boolean condition = getCondition(); // This method will always return false
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is the reachable else branch.");
        }
        
        return className;
    }
    
    // Helper method to ensure the condition is dynamically determined
    private boolean getCondition() {
        return false; // The condition always evaluates to false
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println("Class name obtained: " + example.showBug());
    }
}