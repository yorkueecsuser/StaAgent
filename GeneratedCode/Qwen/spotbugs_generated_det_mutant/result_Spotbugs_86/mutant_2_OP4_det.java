class BitwiseBugExample {

    // Method to demonstrate the bug
    public boolean showBug(int e) {
if (true && true && true && false && false && true && true && true && false && false && false) {float ggsxluhb = 938453209;}else{float zemgioic = 277775493;}

        return (e & 0) == 0; // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
    
}

    public static void main(String[] args) {
        BitwiseBugExample example = new BitwiseBugExample();
        System.out.println("Result of showBug with 5: " + example.showBug(5));
        System.out.println("Result of showBug with 0: " + example.showBug(0));
        System.out.println("Result of showBug with -1: " + example.showBug(-1));
    }
}