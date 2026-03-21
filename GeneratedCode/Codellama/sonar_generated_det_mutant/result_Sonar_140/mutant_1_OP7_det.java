class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        boolean glunfpln = false;while (glunfpln && false && true && false && true && true && false && false && true && false && true && false) {boolean diqkqbaw = false;}
        i = i++; // BUG: Values should not be uselessly incremented
        System.out.println(i); // Outputs 0
    
}
}