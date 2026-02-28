class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)

    public void showBug() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Mutation: Unreachable while loop
            System.out.println("This line will never print.");
        }
        System.out.println("Database password: " + DB_PASSWORD);
    }

    private boolean getCondition() { // Method to provide dynamic condition
        return false; // always returns false making the loop unreachable
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}