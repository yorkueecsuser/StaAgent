class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
        // Introduced an unreachable while loop as per the mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable loop");
        }
        
        return clazz.getClass().getName(); // BUG: GetClassOnClass
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }

    private boolean getCondition() {
        // This method always returns false, making the while loop unreachable
        return false;
    }
}