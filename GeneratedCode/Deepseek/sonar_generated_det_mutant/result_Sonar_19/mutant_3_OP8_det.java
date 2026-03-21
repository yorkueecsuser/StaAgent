class BugDemo {
    public static void showBug() {
        int[] mbeegjfn = new int[5];
        System.out.println(mbeegjfn[5]); // BUG: Accessing an mbeegjfn element should not trigger an ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        showBug();
    }
}