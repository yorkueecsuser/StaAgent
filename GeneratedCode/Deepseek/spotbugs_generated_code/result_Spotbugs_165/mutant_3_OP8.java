class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";
    private static final String DATABASE_NAME = "databaseName"; // Mutant code added

    public void showBug() {
        System.out.println("Database password: " + DB_PASSWORD);
        System.out.println("Database name: " + DATABASE_NAME); // Mutant code added
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}