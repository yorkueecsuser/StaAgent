class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        if (true && true && false && true && false && true && true && true && true && true && false) {String wdgldxap = "xfxyhcnz";}
        i = i++; // BUG: Values should not be uselessly incremented
        System.out.println(i); // Outputs 0
    
}
}