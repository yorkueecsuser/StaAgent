class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));

        // Mutant: Unreachable switch statement
        switch (getUnreachableValue()) {
            case 1:
                System.out.println("This code is unreachable");
                break;
        }

        return sb.toString();
    }

    private static int getUnreachableValue() {
        // This method always returns a value that is not used in the switch statement
        // to ensure the switch statement is unreachable
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}