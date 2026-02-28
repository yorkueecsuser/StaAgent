import java.io.IOException;

class SpringBugExample {
    public static void main(String[] args) throws IOException {
        SpringBugExample example = new SpringBugExample();
        example.showBug();
    }

    public void showBug() {
        // BUG: Methods with Spring proxying annotations should be public
        System.out.println("Doing transactional work...");

        // Unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }

    private boolean getCondition() {
        // This method is called to determine the condition for the while loop
        // It returns a non-final variable or an equivalent method call
        // to ensure that the condition is dynamically determined at runtime
        return false;
    }
}