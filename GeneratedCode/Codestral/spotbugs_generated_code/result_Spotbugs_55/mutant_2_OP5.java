class NullPointerDereferenceBug {

    private String nullString;

    public void initializeString(String str) {
        this.nullString = str;
    }

    public void showBug() {
        int value = 0;
        switch (value) {
            case 1:
                // Unreachable code
                System.out.println("This code should never be executed.");
                break;
        }
        System.out.println(nullString.length()); // Original bug is still present
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bugInstance = new NullPointerDereferenceBug();
        bugInstance.showBug();
    }
}