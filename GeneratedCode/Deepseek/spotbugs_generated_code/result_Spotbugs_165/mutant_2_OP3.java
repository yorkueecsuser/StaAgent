class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)

    public void showBug() {
        boolean shouldShow = getCondition();
        if (shouldShow) {
            if (false) {
                System.out.println("This code was inserted but should never be executed.");
            }
        }
        System.out.println("Database password: " + DB_PASSWORD);
    }

    private boolean getCondition() {
        return false;  // Returns false to make the if block unreachable
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}