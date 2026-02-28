class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)

    public void showBug() {
        System.out.println("Database password: " + DB_PASSWORD);

        // Added do-while loop for demonstration
        int i = 0;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i < 2);
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}