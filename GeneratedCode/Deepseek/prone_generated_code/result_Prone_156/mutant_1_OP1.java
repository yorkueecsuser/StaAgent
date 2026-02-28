class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        String unusedVariable = "unused"; // New mutated code: unused variable declaration
        StringBuilder sb = new StringBuilder(c);
        System.out.println(sb.toString());
    }
}