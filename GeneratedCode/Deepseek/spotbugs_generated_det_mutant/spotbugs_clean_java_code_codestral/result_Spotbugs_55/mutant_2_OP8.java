class NullPointerDereferenceBug {

    private String a; // Mutated: renamed nullString to a

    public void initializeString(String str) {
        this.a = str; // Updated the variable name here as well
    }

    public void showBug() {
        System.out.println(a.length()); // The bug remains the same
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bugInstance = new NullPointerDereferenceBug();
        bugInstance.showBug();
    }
}