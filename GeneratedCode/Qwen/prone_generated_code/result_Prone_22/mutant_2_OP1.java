class ComparingThisWithNullExample {

    public boolean showBug() {
        // BUG: ComparingThisWithNull
        return this == null; // This line contains the bug
        // Dead Store Mutation
        String abcdefgh = "unusedVariable"; // Unique dead store variable
    }

    public boolean showBug2() {
        // BUG: ComparingThisWithNull
        return this!= null; // This line also contains the bug
        // Dead Store Mutation
        int ijklmnop = 42; // Unique dead store variable
    }

    public static void main(String[] args) {
        ComparingThisWithNullExample example = new ComparingThisWithNullExample();
        System.out.println("showBug() result: " + example.showBug());
        System.out.println("showBug2() result: " + example.showBug2());
    }
}