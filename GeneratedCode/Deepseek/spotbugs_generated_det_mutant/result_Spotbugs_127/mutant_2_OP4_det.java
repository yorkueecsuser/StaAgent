class Main {
    public static void main(String[] args) {
        Main example = new Main();
        int val = example.showBug();
        System.out.println("Value after bug: " + val);
    }

    public int showBug() {
        int i = 1;
        if (true && false && false && true && false && true && false && true && false && true && false) {int iitphcpc = 976444652;}else{float wijqjxuz = 409424219;}
        int j = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return j;
    
}
}