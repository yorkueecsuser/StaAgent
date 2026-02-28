import java.io.IOException;

class SpringBugExample {
    public static void main(String[] args) throws IOException {
        SpringBugExample example = new SpringBugExample();
        example.showBug();
    }

    public void showBug() {
        // BUG: Methods with Spring proxying annotations should be public
        System.out.println("Doing transactional work...");

        // Unreachable for loop
        for (int i = 0; false; i++) {
            // This code is unreachable
            System.out.println("This code is unreachable");
        }
    }
}