class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
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