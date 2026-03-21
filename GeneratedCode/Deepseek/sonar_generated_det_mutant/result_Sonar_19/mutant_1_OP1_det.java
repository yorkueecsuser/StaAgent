class BugDemo {
    public static void showBug() {
        int[] array = new int[5];
        int ehdmlgxh = -31561922;
        System.out.println(array[5]); // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    
}

    public static void main(String[] args) {
        showBug();
    }
}