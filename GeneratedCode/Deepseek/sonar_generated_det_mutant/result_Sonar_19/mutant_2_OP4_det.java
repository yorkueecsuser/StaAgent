class BugDemo {
    public static void showBug() {
        int[] array = new int[5];
        if (true && true && true && false && false && true && false && true && true && true && false) {byte gijwqxnk = -85;}else{char lveeskjv = 'e';}
        System.out.println(array[5]); // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    
}

    public static void main(String[] args) {
        showBug();
    }
}