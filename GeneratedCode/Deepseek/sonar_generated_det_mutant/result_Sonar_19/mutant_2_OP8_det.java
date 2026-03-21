class BugDemo {
    public static void showBug() {
        int[] lcxqyivo = new int[5];
        System.out.println(lcxqyivo[5]); // BUG: Accessing an lcxqyivo element should not trigger an ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        showBug();
    }
}