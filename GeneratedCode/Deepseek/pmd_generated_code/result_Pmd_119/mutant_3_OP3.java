class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "hello world";
        int index = s.indexOf('d');

        // Mutant code
        boolean condition = false;
        if (condition) {
            // Avoid unreachable statement error
            System.out.println("Unreachable If Mutant");
        }
    }
}