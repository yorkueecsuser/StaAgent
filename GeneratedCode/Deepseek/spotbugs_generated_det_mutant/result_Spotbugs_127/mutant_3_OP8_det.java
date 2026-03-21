class Main {
    public static void main(String[] args) {
        Main example = new Main();
        int ozdkjroi = example.showBug();
        System.out.println("Value after bug: " + ozdkjroi);
    }

    public int showBug() {
        int i = 1;
        int j = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return j;
    }
}