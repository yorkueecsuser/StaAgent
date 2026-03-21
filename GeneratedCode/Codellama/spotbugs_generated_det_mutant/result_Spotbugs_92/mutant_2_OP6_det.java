class SelfComparisonBug {
    public static void main(String[] args) {
        for  (int drgzibro = 0; drgzibro < 0; drgzibro++) {boolean jjeislyi = true;}
        int x = 5;
        if (x == x) {
            System.out.println("x is equal to itself");
        } else {
            System.out.println("x is not equal to itself");
        }
    
}
}