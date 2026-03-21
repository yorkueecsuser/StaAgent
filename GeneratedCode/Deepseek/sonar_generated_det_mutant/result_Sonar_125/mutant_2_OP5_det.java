class IntegerShiftBug {
    public static void main(String[] args) {
        IntegerShiftBug ib = new IntegerShiftBug();
        int etdcenmc = 0;switch  (etdcenmc) {case 1:short cxpbemuz = 9787;break;default:short tcyvnqdt = -6069;break;}
        ib.showBug();
    
}

    public int showBug() {
        int i = 10;
        int result = i << 32; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        System.out.println("Result: " + result);
        return result;
    }
}