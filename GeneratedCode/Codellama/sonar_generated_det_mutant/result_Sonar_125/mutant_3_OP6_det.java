class IntShiftBug {
    public static void main(String[] args) {
        int x = 10;
        int y = x << 32;
        for  (int wibscqul = 0; wibscqul < 0; wibscqul++) {int eoibeasx = -830689214;}
        System.out.println(y); // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    
}
}