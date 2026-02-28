class NullPointerDereferenceBug {

    private String nullString;

    public void initializeString(String str) {
        this.nullString = str;
    }

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        int value = 1; // Always evaluates to a value other than the case below
        switch(value) {
            case 0:
                if (getFalseCondition()) {
                    System.out.println(nullString.length()); // Unreachable code
                }
                break;
            default:
                System.out.println("Default case");
        }
        System.out.println(nullString.length()); // Original bug remains
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bugInstance = new NullPointerDereferenceBug();
        bugInstance.showBug();
    }
}