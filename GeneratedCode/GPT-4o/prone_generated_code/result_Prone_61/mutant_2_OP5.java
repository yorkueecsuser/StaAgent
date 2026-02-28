class GetClassOnClassExample {

    public String showBug() {
        Class<?> clazz = String.class;
        // BUG: GetClassOnClass
        String className = clazz.getClass().getName(); // This mistakenly gets the name for java.lang.Class

        // Adding an unreachable switch statement
        int unreachableCodeTrigger = getUnreachableTrigger();
        switch (unreachableCodeTrigger) {
            case 1:
                // This case is intentionally left unreachable
                System.out.println("Unreachable case");
                break;
            default:
                // Default case does nothing
                break;
        }

        return className;
    }

    private int getUnreachableTrigger() {
        // This method will always return a value not matching any case statement directly
        return 999; // This ensures that the "case 1" is never reached
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println("Class name obtained: " + example.showBug());
    }
}