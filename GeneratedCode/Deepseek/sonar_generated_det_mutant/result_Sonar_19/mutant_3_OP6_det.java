class BugDemo {
    public static void showBug() {
        int[] array = new int[5];
        for  (int qncndpyc = 0; qncndpyc < 0; qncndpyc++) {int nfkcqixv = 292316979;}
        System.out.println(array[5]); // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    
}

    public static void main(String[] args) {
        showBug();
    }
}