class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)

    public void showBug() {
        boolean shouldPrintPassword = getCondition();  // New dynamically determined condition
        if (shouldPrintPassword) {
            System.out.println("Database password: " + DB_PASSWORD);
        }
    }

    private boolean getCondition() {
        return false;  // Always return false to make the if branch unreachable
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}