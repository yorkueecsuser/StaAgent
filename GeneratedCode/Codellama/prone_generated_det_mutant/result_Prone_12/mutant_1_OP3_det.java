class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        if (true && false && true && false && false && true && true && true && false && true && false) {float emvbdqbf = -403045762;}
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);
    
}
}