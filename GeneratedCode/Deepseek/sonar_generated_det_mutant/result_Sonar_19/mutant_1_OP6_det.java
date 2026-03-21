class BugDemo {
    public static void showBug() {
        int[] array = new int[5];
        for  (int pwxxhuen = 0; pwxxhuen < 0; pwxxhuen++) {short xjpbvogp = -4984;}
        System.out.println(array[5]); // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    
}

    public static void main(String[] args) {
        showBug();
    }
}