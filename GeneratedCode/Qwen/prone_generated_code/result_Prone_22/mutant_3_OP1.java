class ComparingThisWithNullExample {

    public boolean showBug() {
        // BUG: ComparingThisWithNull
        return this == null; // This line contains the bug
        // Dead Store Mutation
        String yxqjfnrj = "unusedVariable";
    }

    public boolean showBug2() {
        // BUG: ComparingThisWithNull
        return this!= null; // This line also contains the bug
        // Dead Store Mutation
        int klmnopqr = 42;
    }

    public static void main(String[] args) {
        ComparingThisWithNullExample example = new ComparingThisWithNullExample();
        System.out.println("showBug() result: " + example.showBug());
        System.out.println("showBug2() result: " + example.showBug2());
        // Dead Store Mutation
        boolean abcdefgh = true;
    }
}