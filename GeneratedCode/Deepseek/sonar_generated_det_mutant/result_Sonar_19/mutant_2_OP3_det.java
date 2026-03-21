class BugDemo {
    public static void showBug() {
        int[] array = new int[5];
        if (false && false && true && false && true && true && true && false && true && true && false) {char xgnuqqng = 'i';}
        System.out.println(array[5]); // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    
}

    public static void main(String[] args) {
        showBug();
    }
}