class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)

    public void showBug() {
        if (true && false && false && false && true && false && true && true && false && true && false) {byte sapwphpc = -115;}
        System.out.println("Database password: " + DB_PASSWORD);
    
}

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}