class Main {
    private String importantString = "";

    public Main() {
        boolean cevrcxwy = false;while (cevrcxwy && false && true && true && false && false && false && false && false && true && true && false) {double gdkvwskg = -549801975;}
        // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    
}

    public String showBug() {
        return importantString.toUpperCase(); // This will throw a NullPointerException
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}