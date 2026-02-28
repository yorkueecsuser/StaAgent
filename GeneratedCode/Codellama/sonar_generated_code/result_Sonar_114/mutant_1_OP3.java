import java.io.IOException;

class SpringBugExample {
    public static void main(String[] args) throws IOException {
        SpringBugExample example = new SpringBugExample();
        example.showBug();
    }

    public void showBug() {
        // BUG: Methods with Spring proxying annotations should be public
        System.out.println("Doing transactional work...");
    }

    // Mutated Code
    public void showBug() {
        // BUG: Methods with Spring proxying annotations should be public
        System.out.println("Doing transactional work...");
        boolean condition = getCondition();
        if (condition) {
            // code
        }
    }

    private boolean getCondition() {
        // non-final variable or an equivalent method call
        return true;
    }
}