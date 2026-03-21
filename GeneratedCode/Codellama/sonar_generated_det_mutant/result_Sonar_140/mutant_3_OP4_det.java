class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        if (true && false && false && false && true && true && false && false && true && true && false) {byte zgobskoh = 4;}else{double oeczgbly = -406222516;}
        i = i++; // BUG: Values should not be uselessly incremented
        System.out.println(i); // Outputs 0
    
}
}