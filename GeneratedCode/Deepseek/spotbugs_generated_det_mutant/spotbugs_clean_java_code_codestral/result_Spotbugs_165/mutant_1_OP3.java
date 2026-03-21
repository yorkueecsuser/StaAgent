class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        System.out.println("Database password: " + DB_PASSWORD);

        // Mutant code: Unreachable if statement
        if (getFalseCondition()) {
            System.out.println("This line will never be executed");
        }
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}