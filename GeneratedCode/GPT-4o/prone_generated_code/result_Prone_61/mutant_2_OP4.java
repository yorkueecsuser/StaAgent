class GetClassOnClassExample {

    public String showBug() {
        Class<?> clazz = String.class;
        // BUG: GetClassOnClass
        String className = clazz.getClass().getName(); // This mistakenly gets the name for java.lang.Class
        
        // Unreachable if-else statement using a non-final variable
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This part is never executed.");
        } else {
            System.out.println("This part is always executed.");
        }
        
        return className;
    }

    private boolean getCondition() {
        return false; // Dynamically returns false
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println("Class name obtained: " + example.showBug());
    }
}