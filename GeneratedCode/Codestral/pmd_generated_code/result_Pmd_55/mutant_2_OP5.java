class MisplacedNullCheckBug {
    private String a;
    private String baz;

    public MisplacedNullCheckBug() {
        // default constructor
    }

    // Method that always returns false
    private boolean isFalse() {
        return false;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setBaz(String baz) {
        this.baz = baz;
    }

    public boolean showBug() {
        if (isFalse()) {
            switch (a) {
                case "bug":
                    // Unreachable code
                    break;
                default:
                    break;
            }
        }
        return a.equals(baz) && a!= null; // Original code
    }
}