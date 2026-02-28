class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
        return clazz.getClass().getName(); // BUG: GetClassOnClass

        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() will always return false
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}