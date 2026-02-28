class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)

    public void showBug() {
        // Mutation: Unreachable switch statement
        boolean shouldRun = getCondition();
        if (!shouldRun) {
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("This line will never be executed due to unreachable switch statement.");
                    break;
            }
        }
        System.out.println("Database password: " + DB_PASSWORD);
    }

    private boolean getCondition() {
        return false; // This method always returns false to make the switch statement unreachable
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}