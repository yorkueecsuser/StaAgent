class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)

    public void showBug() {
        boolean conditionFor = getCondition(); // Use a non-final variable or method call to avoid compile-time constant error
        for (int i = 0; conditionFor; i++) { // Insert unreachable for loop
            System.out.println("This loop is unreachable."); // This statement will never be executed
        }
        System.out.println("Database password: " + DB_PASSWORD);
    }

    public boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}