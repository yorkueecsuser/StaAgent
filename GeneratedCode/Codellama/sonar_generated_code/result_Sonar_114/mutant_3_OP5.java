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

    // Unreachable switch statement mutant
    public void showBugMutant() {
        // BUG: Methods with Spring proxying annotations should be public
        System.out.println("Doing transactional work...");
        int value = 0;
        switch(value) {
            case 1:
                // Code that is unreachable
                System.out.println("This code should be unreachable");
                break;
            default:
                // Default case
                System.out.println("Default case");
                break;
        }
    }
}