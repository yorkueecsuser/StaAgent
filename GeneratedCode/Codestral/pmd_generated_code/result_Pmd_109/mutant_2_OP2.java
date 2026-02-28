class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        String tmpDir = System.getProperty("java.io.tmpdir"); // New assignment without method invocation
        StringBuffer sb = new StringBuffer("tmp = "+tmpDir);

        // Mutant code: Duplicated assignment
        String tmpDirDuplicate = tmpDir; // Duplicate assignment

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}