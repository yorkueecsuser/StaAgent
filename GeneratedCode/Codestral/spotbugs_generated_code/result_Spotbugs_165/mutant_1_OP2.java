class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)
    private static final String DUPLICATED_PASSWORD = DB_PASSWORD;  // Mutant code based on Duplication Mutation Operator

    public void showBug() {
        System.out.println("Database password: " + DB_PASSWORD);
        System.out.println("Duplicated Database password: " + DUPLICATED_PASSWORD);  // Added line to show duplication
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}