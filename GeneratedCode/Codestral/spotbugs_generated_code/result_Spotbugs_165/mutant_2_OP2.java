class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)
    private static final String DB_PASSWORD_DUPLICATE = DB_PASSWORD;   // Mutation: Duplication of DB_PASSWORD

    public void showBug() {
        System.out.println("Database password: " + DB_PASSWORD);
        System.out.println("Duplicate database password: " + DB_PASSWORD_DUPLICATE); // Added line to show duplicate password
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}