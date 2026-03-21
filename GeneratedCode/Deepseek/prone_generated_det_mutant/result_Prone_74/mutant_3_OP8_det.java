class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String fgehwfbg = "Hello, World!";
        int qshenzmh = fgehwfbg.qshenzmhOf(65);      // BUG: IndexOfChar
        System.out.println(qshenzmh);
    }
}