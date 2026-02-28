class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            resource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Unreachable for loop
        for (int i = 0; getCondition(); i++) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }

    public static boolean getCondition() {
        return false;
    }
}