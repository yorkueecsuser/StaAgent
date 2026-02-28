class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // Original bug still exists
    private String DB_PWD = "renameExample";  // Mutant code: Renamed variable

    public void showBug() {
        System.out.println("Database password: " + DB_PASSWORD);
        System.out.println("Renamed variable: " + DB_PWD);  // Using the renamed variable
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}