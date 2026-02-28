class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";

    private static boolean isFalse() {
        return false;
    }

    public void showBug() {
        System.out.println("Database password: " + DB_PASSWORD);

        if (isFalse()) {
            System.out.println("This line will never be printed");
        } else {
            System.out.println("This line will always be printed");
        }
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}