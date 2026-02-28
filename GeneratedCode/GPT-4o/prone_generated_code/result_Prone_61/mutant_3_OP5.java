class GetClassOnClassExample {

    public String showBug() {
        Class<?> clazz = String.class;
        // BUG: GetClassOnClass
        String className = clazz.getClass().getName(); // This mistakenly gets the name for java.lang.Class

        // Unreachable switch statement as per mutation operator
        int unreachableValue = getUnreachableValue(); // non-final variable
        switch (unreachableValue) {
            case 1: // This case is never reached
                System.out.println("This is unreachable code.");
                break;
            default:
                // Default case, can remain empty or have a comment
                break;
        }

        return className;
    }

    private int getUnreachableValue() {
        return -1; // Always returns a value not covered by any switch case
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println("Class name obtained: " + example.showBug());
    }
}