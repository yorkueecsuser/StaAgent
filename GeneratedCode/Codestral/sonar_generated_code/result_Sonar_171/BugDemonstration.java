class BugDemonstration {
    public static void showBug() {
        try {
            throwException();
        } catch (RuntimeException e) {
            System.out.println("ERROR");
        }
    }

    public static void throwException() {
        try {
            throw new RuntimeException();
        } finally {
            for (int i = 0; i < 10; i ++) {
                if (i == 5) {
                    return;  // BUG: Jump statements should not occur in "finally" blocks
                }
            }
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}