class GetClassOnClassExample {

    public String showBug() {
        Class<?> clazz = String.class;
        // BUG: GetClassOnClass
        String className = clazz.getClass().getName(); // This mistakenly gets the name for java.lang.Class
        
        // Introduce an unreachable for loop
        boolean forLoopCondition = getUnreachableCondition();
        for (int i = 0; forLoopCondition; i++) {
            // This block will never execute
            System.out.println("Unreachable code inside for loop");
        }
        
        return className;
    }

    // Method to simulate a false condition for the unreachable loop
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println("Class name obtained: " + example.showBug());
    }
}