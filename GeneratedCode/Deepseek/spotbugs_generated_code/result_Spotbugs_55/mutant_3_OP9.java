class NullPointerDereferenceBug {

    private String nullString;

    public void initializeString(String str) {
        this.nullString = str;
    }

    public void showBug() {
        int i = 0;
        do {
            System.out.println(nullString.length()); // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
            i++;
        } while (i < 1); // This loop will execute once, maintaining the original functionality
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bugInstance = new NullPointerDereferenceBug();
        bugInstance.showBug();
    }
}