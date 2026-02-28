class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)
    private static final String DUPLICATE_PASSWORD = DB_PASSWORD;     // Mutated code: Duplication

    public void showBug() {
        System.out.println("Database password: " + DB_PASSWORD);
        System.out.println("Duplicate password: " + DUPLICATE_PASSWORD); // Added line to demonstrate the duplicated password
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}