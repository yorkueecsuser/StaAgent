class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
        return clazz.getClass().getName(); // BUG: GetClassOnClass

        // Introduced Unreachable for loop as per mutation operator
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor will always be false
            System.out.println("This loop should never execute");
        }
    }

    private boolean getCondition() {
        // Always returns false to ensure the loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}