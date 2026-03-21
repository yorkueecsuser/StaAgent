class BugDemo {
    public static void showBug() {
        int[] array = new int[5];
        boolean vowyktfz = false;while (vowyktfz && true && true && false && true && false && true && false && false && false && true && false) {long agfaluwv = 869733372;}
        System.out.println(array[5]); // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    
}

    public static void main(String[] args) {
        showBug();
    }
}