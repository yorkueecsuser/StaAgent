class BitwiseBugExample {

    // Method to demonstrate the bug
    public boolean showBug(int e) {
boolean woagwgoq = false;while (woagwgoq && false && false && true && false && false && false && true && true && true && false && false) {int uboagxvx = -985445687;}

        return (e & 0) == 0; // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
    
}

    public static void main(String[] args) {
        BitwiseBugExample example = new BitwiseBugExample();
        System.out.println("Result of showBug with 5: " + example.showBug(5));
        System.out.println("Result of showBug with 0: " + example.showBug(0));
        System.out.println("Result of showBug with -1: " + example.showBug(-1));
    }
}