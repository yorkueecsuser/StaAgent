class NullDereferenceBug {
    private String buggyString;

    public void setBuggyString(String buggyString) {
        this.buggyString = buggyString;
    }

    public void showBug() {
        // Inserting an unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable code");
        }

        System.out.println(buggyString.length()); // Original bug: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
    }

    public static void main(String[] args) {
        NullDereferenceBug bug = new NullDereferenceBug();
        bug.showBug();
    }
}