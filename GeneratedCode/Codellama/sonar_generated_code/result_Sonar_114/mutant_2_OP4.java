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

    // Mutant code begin
    public void showBugMutant() {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Doing transactional work...");
        } else {
            System.out.println("Doing nothing...");
        }
    }
    // Mutant code end
}