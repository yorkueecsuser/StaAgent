class BugDemo {
    public static void showBug() {
        int[] array = new int[5];
        if (true && false && true && false && true && false && false && true && false && true && false) {boolean maulluso = true;}
        System.out.println(array[5]); // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    
}

    public static void main(String[] args) {
        showBug();
    }
}