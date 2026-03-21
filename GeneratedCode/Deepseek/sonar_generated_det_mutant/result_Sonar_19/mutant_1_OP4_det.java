class BugDemo {
    public static void showBug() {
        int[] array = new int[5];
        if (true && false && false && true && true && true && false && false && true && true && false) {long rlqknjko = 867351821;}else{byte igjhwwju = -123;}
        System.out.println(array[5]); // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    
}

    public static void main(String[] args) {
        showBug();
    }
}