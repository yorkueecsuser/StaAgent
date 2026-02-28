class NullPointerDereferenceBug {

    private String nullString;

    private boolean alwaysFalse() {
        return false;
    }

    public void initializeString(String str) {
        this.nullString = str;
    }

    public void showBug() {
        while (alwaysFalse()) {
            // Unreachable while loop mutant
            System.out.println("This is an unreachable loop");
        }
        System.out.println(nullString.length()); // Original bug: NP: Null pointer dereference (NP_ALWAYS_NULL)
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bugInstance = new NullPointerDereferenceBug();
        bugInstance.showBug();
    }
}