class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        StringBuilder sb = new StringBuilder(c);
        StringBuilder sb1 = new StringBuilder(c);  // Duplication: StringBuilderInitWithChar
        System.out.println(sb.toString());
    }
}