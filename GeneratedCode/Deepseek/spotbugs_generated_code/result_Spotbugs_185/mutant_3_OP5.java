class NonFinalFieldBug {
    public static int buggyField;

    static {
        buggyField = 10;
        buggyField = 20;
    }

    public static int showBug() {
        // Inserted unreachable switch statement
        boolean condition = false;
        switch (condition) {
            case true:
                System.out.println("This code is unreachable.");
                break;
        }
        return buggyField;
    }

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
    }
}