class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)

    public void showBug() {
        System.out.println("Database password: " + DB_PASSWORD);

        // Unreachable if-else branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block should never execute
            System.out.println("This is an unreachable block of code");
        } else {
            // This else block is also unreachable
            System.out.println("This is another unreachable block of code");
        }
    }

    // This method always returns false to ensure the if-else branch is unreachable
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}