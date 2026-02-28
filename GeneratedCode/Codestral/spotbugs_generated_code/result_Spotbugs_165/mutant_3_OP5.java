class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)

    public void showBug() {
        // Mutant code: Unreachable switch statement added
        boolean isFalse = false;
        int value = 0;
        if (isFalse) {
            switch(value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }

        System.out.println("Database password: " + DB_PASSWORD);
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}