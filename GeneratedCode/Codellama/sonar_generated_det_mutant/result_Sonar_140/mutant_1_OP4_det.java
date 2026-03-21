class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        if (true && false && false && true && true && false && true && true && true && false && false) {float uliypscn = -509499840;}else{float wtpwlkfq = -428722082;}
        i = i++; // BUG: Values should not be uselessly incremented
        System.out.println(i); // Outputs 0
    
}
}