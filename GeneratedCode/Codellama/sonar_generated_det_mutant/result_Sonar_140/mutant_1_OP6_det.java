class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        for  (int vrtbsgie = 0; vrtbsgie < 0; vrtbsgie++) {short iqtfrskl = -3630;}
        i = i++; // BUG: Values should not be uselessly incremented
        System.out.println(i); // Outputs 0
    
}
}