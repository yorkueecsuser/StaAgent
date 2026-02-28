class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        StringBuilder sb1 = new StringBuilder(c);  // BUG: StringBuilderInitWithChar1
        System.out.println(sb1.toString());
    }
}