import java.io.IOException;

class SpringBugExample {
    public static void main(String[] args) throws IOException {
        SpringBugExample example = new SpringBugExample();
        example.showBug();
    }

    public void showBug() {
        // BUG: Methods with Spring proxying annotations should be public
        System.out.println("Doing transactional work...");

        // Unreachable if statement
        if (false) {
            System.out.println("This statement is unreachable.");
        }
    }
}