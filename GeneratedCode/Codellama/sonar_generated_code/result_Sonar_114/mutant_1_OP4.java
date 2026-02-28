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
        // MUTANT: Inserted unreachable if-else branch
        if (false) {
            System.out.println("This branch is unreachable...");
        } else {
            System.out.println("This branch is reachable...");
        }
        // MUTANT: Inserted unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("This loop is unreachable...");
        }
        // MUTANT: Inserted unreachable while loop
        while (false) {
            System.out.println("This loop is unreachable...");
        }
        // MUTANT: Inserted unreachable switch statement
        switch (0) {
            case 1:
                System.out.println("This case is unreachable...");
                break;
        }
    }
}