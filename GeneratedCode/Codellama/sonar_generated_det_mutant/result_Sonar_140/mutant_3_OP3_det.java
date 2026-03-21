class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        if (false && true && true && true && false && true && false && false && true && true && false) {String jnsfalkm = "lfebnode";}
        i = i++; // BUG: Values should not be uselessly incremented
        System.out.println(i); // Outputs 0
    
}
}