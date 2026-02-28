class NullPointerDereferenceBug {

    private String nullString;

    public void initializeString(String str) {
        this.nullString = str;
    }

    public void showBug() {
        if (false) {  // Unreachable if statement mutation
            System.out.println("This line will never execute.");
        }
        System.out.println(nullString.length());  // Original bug: NP: Null pointer dereference (NP_ALWAYS_NULL)
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bugInstance = new NullPointerDereferenceBug();
        bugInstance.showBug();
    }
}