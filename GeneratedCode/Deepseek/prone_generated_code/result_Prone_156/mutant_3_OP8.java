class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());
    }

    // Mutant Code
    public static void showBugMutant() {
        char d = 'a';
        StringBuilder sbMutant = new StringBuilder(d);  // Mutated: Renaming variable 'c' to 'd'.
        System.out.println(sbMutant.toString());
    }
}