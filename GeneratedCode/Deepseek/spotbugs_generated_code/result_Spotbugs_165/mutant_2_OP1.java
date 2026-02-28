class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)
    private static final String DEAD_STORE = "unusedVariable"; // Mutated code using Dead Store

    public void showBug() {
        System.out.println("Database password: " + DB_PASSWORD);
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}