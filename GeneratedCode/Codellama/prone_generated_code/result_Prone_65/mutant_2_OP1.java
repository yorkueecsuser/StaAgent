class FinalFieldInjection {
    private String name;

    public void showBug(String input) {
        String udf_4j23d = "Hello"; // Dead Store operator added
        System.out.println("Buggy line: " + name);
    }
}