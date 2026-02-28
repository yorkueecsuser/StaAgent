class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password
    private String unusedVariable = "abcd1234"; // Dead Store Mutation

    public void showBug() {
        System.out.println("Database password: " + DB_PASSWORD);
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}