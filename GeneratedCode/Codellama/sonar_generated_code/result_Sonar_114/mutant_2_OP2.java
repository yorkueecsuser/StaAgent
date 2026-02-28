import java.io.IOException;

class SpringBugExample {
    public static void main(String[] args) throws IOException {
        SpringBugExample example = new SpringBugExample();
        example.showBug();
    }

    public void showBug() {
        System.out.println("Doing transactional work...");
        System.out.println("Doing transactional work..."); // Mutant
    }
}