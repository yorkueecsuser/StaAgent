class ComparingThisWithNullExample {

    public boolean showBug() {
        // BUG: ComparingThisWithNull
        return this == null; // This line contains the bug
    }

    public boolean showBug2() {
        // BUG: ComparingThisWithNull
        return this!= null; // This line also contains the bug
    }

    public static void main(String[] args) {
        ComparingThisWithNullExample example = new ComparingThisWithNullExample();
        System.out.println("showBug() result: " + example.showBug());
        System.out.println("showBug2() result: " + example.showBug2());

        // Mutated code
        ComparingThisWithNullExample x = new ComparingThisWithNullExample();
        System.out.println("x.showBug() result: " + x.showBug());
        System.out.println("x.showBug2() result: " + x.showBug2());
    }
}