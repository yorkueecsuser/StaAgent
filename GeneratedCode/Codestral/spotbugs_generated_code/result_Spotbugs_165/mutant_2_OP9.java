class DatabaseConnection {
    private static final String DB_PASSWORD;  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)

    static {
        String password = "";
        char[] hardcodedPassword = {'h', 'a', 'r', 'd', 'c', 'o', 'd', 'e', 'd', 'P', 'a','s','s', 'w', 'o', 'r', 'd', '1', '2', '3'};
        for (char c : hardcodedPassword) { // Equivalent Loop Replacement
            password += c;
        }
        DB_PASSWORD = password;
    }

    public void showBug() {
        System.out.println("Database password: " + DB_PASSWORD);
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}