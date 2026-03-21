class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)
    private String tempVariable = "temporaryValue";  // MUTANT: Renamed variable based on mutation operator information

    public void showBug() {
        System.out.println("Database password: " + DB_PASSWORD);
        System.out.println("Temporary variable: " + tempVariable);
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}