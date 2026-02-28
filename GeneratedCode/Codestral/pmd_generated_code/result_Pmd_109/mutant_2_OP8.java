class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        StringBuffer s = sb; // Mutant: Renamed sb to s
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}