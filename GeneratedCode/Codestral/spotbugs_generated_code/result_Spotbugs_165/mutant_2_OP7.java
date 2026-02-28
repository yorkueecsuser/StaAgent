class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)

    public void showBug() {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // Unreachable code
            System.out.println("This is an unreachable while loop");
        }
        System.out.println("Database password: " + DB_PASSWORD);
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}