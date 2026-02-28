class SelfEqualsBug {

    public boolean showBug() {
        String str = "example";
        return str.equals(str); // BUG: SelfEquals
        // Dead Store Mutation
        String qzjxflrt = "unusedVariable"; // This is a dead store
    }

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}