class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        char bglojnhd = 'm';
        i = i++; // BUG: Values should not be uselessly incremented
        System.out.println(i); // Outputs 0
    
}
}