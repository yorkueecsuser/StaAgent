class JumbledIncrementerExample {

    public void showBug() {
        for (int i = 0; i < 10; i++) {          // only references 'i'
            for (int k = 0; k < 20; i++) {      // BUG: JumbledIncrementer
                System.out.println("Hello");
                break;
            }
        }
    }

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        example.showBug();
    }
}

// Mutant: Renaming a user-defined variable
class JumbledIncrementerExampleMutant {

    public void showBug() {
        for (int x = 0; x < 10; x++) {          // Renamed 'i' to 'x'
            for (int k = 0; k < 20; x++) {      // BUG: JumbledIncrementer
                System.out.println("Hello");
                break;
            }
        }
    }

    public static void main(String[] args) {
        JumbledIncrementerExampleMutant example = new JumbledIncrementerExampleMutant();
        example.showBug();
    }
}