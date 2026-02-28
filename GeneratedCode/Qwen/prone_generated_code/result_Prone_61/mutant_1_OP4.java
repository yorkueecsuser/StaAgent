class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
        // Introducing an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because getCondition() always returns false
            System.out.println("This is an unreachable block.");
        } else {
            // This block will also never execute because the if condition is always false
            System.out.println("This is another unreachable block.");
        }

        return clazz.getClass().getName(); // BUG: GetClassOnClass
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else blocks unreachable
        return false;
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}