class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
        boolean condition = getCondition(); // Ensure this condition is dynamically determined at runtime
        if (condition) {
            // This block is unreachable because getCondition() should return false
            System.out.println("This is an unreachable block.");
        }
        return clazz.getClass().getName(); // BUG: GetClassOnClass
    }

    private boolean getCondition() {
        // This method should return false to ensure the if block is unreachable
        return false;
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}