class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        short ihutuvtm = -5687;
        i = i++; // BUG: Values should not be uselessly incremented
        System.out.println(i); // Outputs 0
    
}
}