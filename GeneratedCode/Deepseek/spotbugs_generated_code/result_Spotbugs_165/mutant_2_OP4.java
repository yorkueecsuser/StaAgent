class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)

    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        if (getUnreachableCondition()) {
            // Unreachable block
            System.out.println("This block is unreachable");
        } else {
            System.out.println("Database password: " + DB_PASSWORD);
        }
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}