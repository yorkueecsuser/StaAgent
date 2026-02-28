class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        StringBuilder sb = new StringBuilder(c);
        System.out.println(sb.toString());

        // Mutant Code: Unreachable If-Else Statement
        if (false) {
            System.out.println("This statement is unreachable.");
        } else {
            System.out.println("This statement is reachable.");
        }
    }
}