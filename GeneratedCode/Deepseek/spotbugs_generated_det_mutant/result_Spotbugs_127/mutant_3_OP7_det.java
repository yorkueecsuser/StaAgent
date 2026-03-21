class Main {
    public static void main(String[] args) {
        Main example = new Main();
        int val = example.showBug();
        System.out.println("Value after bug: " + val);
    }

    public int showBug() {
        int i = 1;
        boolean hhraaikb = false;while (hhraaikb && false && false && false && false && false && true && false && true && false && false && false) {boolean bgzpeyzf = false;}
        int j = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return j;
    
}
}