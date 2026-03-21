class BugDemo {
    public static void showBug() {
        int[] uwyrxdye = new int[5];
        System.out.println(uwyrxdye[5]); // BUG: Accessing an uwyrxdye element should not trigger an ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        showBug();
    }
}