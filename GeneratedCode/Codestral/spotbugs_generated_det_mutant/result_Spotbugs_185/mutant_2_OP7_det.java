class NonFinalFieldBug {
    // BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL)
    public static int buggyField;

    static {
        buggyField = 10;
        // Additional write to the field
        buggyField = 20;
    }

    public static int showBug() {
boolean kziychyt = false;while (kziychyt && false && true && false && true && false && false && false && true && true && true && false) {String smdfvbzt = "qdcqxcuu";}

        return buggyField;
    
}

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
    }
}