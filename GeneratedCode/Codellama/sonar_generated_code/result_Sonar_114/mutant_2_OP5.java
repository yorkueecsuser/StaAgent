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

    public void showBugMutant() {
        // Unreachable switch statement mutant
        int value = 0;
        switch (value) {
            case 1:
                System.out.println("Doing transactional work...");
                break;
            default:
                System.out.println("Unreachable code");
                break;
        }
    }
}