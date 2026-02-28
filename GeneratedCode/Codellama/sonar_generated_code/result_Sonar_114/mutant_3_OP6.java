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

    // 1. Unreachable for loop
    public void showBugWithUnreachableForLoop() {
        // BUG: Methods with Spring proxying annotations should be public
        System.out.println("Doing transactional work...");

        // Insert unreachable for loop
        int i = 0;
        for (; false; i++) {
            // This code will never be executed
            System.out.println("This code is unreachable");
        }
    }
}