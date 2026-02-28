class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {
            // Unreachable code due to condition always being false
            System.out.println("This is an unreachable statement.");
        }
        return clazz.getClass().getName(); // BUG: GetClassOnClass
    }

    private boolean getCondition() {
        // This method can be modified to return true or false dynamically
        return false;
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}