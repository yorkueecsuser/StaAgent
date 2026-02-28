import java.io.IOException;

class SpringBugExample {
    public static void main(String[] args) throws IOException {
        SpringBugExample example = new SpringBugExample();
        example.showBug();
    }

    public void showBug() {
        // BUG: Methods with Spring proxying annotations should be public
        System.out.println("Doing transactional work...");

        // Add unreachable switch statement
        switch (0) {
            case 1:
                System.out.println("Reachable code");
                break;
            default:
                System.out.println("Unreachable code");
                break;
        }
    }
}