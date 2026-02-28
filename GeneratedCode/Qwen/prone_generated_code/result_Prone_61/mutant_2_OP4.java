class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because getCondition() always returns false
            System.out.println("This is an unreachable if block.");
        } else {
            // This block will always execute
            System.out.println("This is the reachable else block.");
        }
        return clazz.getClass().getName(); // BUG: GetClassOnClass
    }

    private boolean getCondition() {
        // Always returns false to ensure the if block is unreachable
        return false;
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}