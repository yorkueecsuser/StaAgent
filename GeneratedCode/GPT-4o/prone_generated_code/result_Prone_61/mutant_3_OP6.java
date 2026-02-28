class GetClassOnClassExample {

    public String showBug() {
        Class<?> clazz = String.class;
        // BUG: GetClassOnClass
        String className = clazz.getClass().getName(); // This mistakenly gets the name for java.lang.Class

        // Mutation Operator: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable because conditionFor is false
            System.out.println("This is an unreachable for loop.");
        }

        return className;
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println("Class name obtained: " + example.showBug());
    }
}