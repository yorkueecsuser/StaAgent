import java.io.IOException;

class SpringBugExample {
    public static void main(String[] args) throws IOException {
        SpringBugExample example = new SpringBugExample();
        example.showBug();
    }

    public void showBug() {
        // Unreachable if-else statement mutant
        if (false) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("Doing transactional work...");
        }
    }
}