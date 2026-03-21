class Main {
    public static void main(String[] args) {
        Main example = new Main();
        int val = example.showBug();
        System.out.println("Value after bug: " + val);
    }

    public int showBug() {
        int i = 1;
        boolean gdlktacr = false;while (gdlktacr && true && true && true && true && true && true && false && true && false && true && false) {String suhxfubo = "lfwrmhvb";}
        int j = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return j;
    
}
}