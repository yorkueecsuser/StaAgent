class Main {
    public static void main(String[] args) {
        //...
        boolean condition = false; // Here, false is used directly as the condition, making the statement unreachable
        if (condition) { // This is the unreachable statement
            System.out.println("This statement will never be executed");
        }
        //...
    }
}