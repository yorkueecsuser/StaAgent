class ComparingThisWithNullExample {

    public boolean showBug() {
        // BUG: ComparingThisWithNull
        return this == null; // This line contains the bug
    }

    public boolean showBug2() {
        // BUG: ComparingThisWithNull
        return this!= null; // This line also contains the bug
    }

    // Mutant 1: Renaming 'this' to 'a'
    public boolean showBugMutant1() {
        // BUG: ComparingThisWithNull
        Object a = this;
        return a == null; // This line contains the bug
    }

    // Mutant 2: Renaming 'this' to 'b'
    public boolean showBug2Mutant2() {
        // BUG: ComparingThisWithNull
        Object b = this;
        return b!= null; // This line also contains the bug
    }

    public static void main(String[] args) {
        ComparingThisWithNullExample example = new ComparingThisWithNullExample();
        System.out.println("showBug() result: " + example.showBug());
        System.out.println("showBug2() result: " + example.showBug2());
        System.out.println("showBugMutant1() result: " + example.showBugMutant1());
        System.out.println("showBug2Mutant2() result: " + example.showBug2Mutant2());
    }
}