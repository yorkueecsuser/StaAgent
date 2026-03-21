class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        if (false && true && true && false && true && true && false && true && false && true && false) {byte yaofeerv = 65;}
        i = i++; // BUG: Values should not be uselessly incremented
        System.out.println(i); // Outputs 0
    
}
}