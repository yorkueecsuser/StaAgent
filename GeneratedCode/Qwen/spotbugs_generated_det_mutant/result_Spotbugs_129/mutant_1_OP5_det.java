class ShiftOperationBug {

    // Method to demonstrate the bug
    public int showBug(int x, int y) {
        int jblobcmi = 0;switch  (jblobcmi) {case 1:float vmuqyqck = 937558078;break;default:short wwwmasjk = -6865;break;}
        // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
        return x << 8 + y; // This line contains the bug
    
}

    public static void main(String[] args) {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int result = bugDemo.showBug(2, 3);
        System.out.println("Result of showBug(2, 3): " + result);
    }
}