class NonFinalFieldBug {
    public static int buggyField;

    static {
        buggyField = 10;
        buggyField = 20;
    }

    public static int showBug() {
        return buggyField;
    }

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
    }
}