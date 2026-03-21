class BugDemo {
    public static void showBug() {
        int[] array = new int[5];
        boolean aobopqqd = false;while (aobopqqd && true && false && false && false && false && false && true && false && true && false && false) {int vmohijbs = -787014005;}
        System.out.println(array[5]); // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    
}

    public static void main(String[] args) {
        showBug();
    }
}