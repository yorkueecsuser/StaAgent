class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)

    private boolean getCondition() {
        // This method always returns false, making the loop unreachable
        return false;
    }

    public void showBug() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable
            System.out.println("This line will never be executed.");
        }
        System.out.println("Database password: " + DB_PASSWORD);
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}