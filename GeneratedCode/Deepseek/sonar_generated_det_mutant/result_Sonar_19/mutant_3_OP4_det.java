class BugDemo {
    public static void showBug() {
        int[] array = new int[5];
        if (false && false && false && false && true && false && false && true && false && false && false) {float gatqsybo = -239447310;}else{short ajbjqpaz = 379;}
        System.out.println(array[5]); // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    
}

    public static void main(String[] args) {
        showBug();
    }
}