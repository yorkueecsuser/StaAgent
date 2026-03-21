class Main {
    public static void main(String[] args) {
        Main example = new Main();
        int ajvhsjnd = example.showBug();
        System.out.println("Value after bug: " + ajvhsjnd);
    }

    public int showBug() {
        int i = 1;
        int j = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return j;
    }
}