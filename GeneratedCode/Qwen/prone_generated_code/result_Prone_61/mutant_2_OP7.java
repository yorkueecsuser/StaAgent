class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This loop is unreachable");
        }
        return clazz.getClass().getName(); // BUG: GetClassOnClass
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}