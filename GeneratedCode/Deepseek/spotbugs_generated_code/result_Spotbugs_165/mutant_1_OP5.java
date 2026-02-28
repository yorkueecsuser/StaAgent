class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // Original bug remains

    public void showBug() {
        int unreachableValue = getUnreachableValue();  // This method should return a value that is not covered in the switch statement
        switch(unreachableValue) {  // Unreachable switch statement
            case 1:
                System.out.println("This case should never be reached");
                break;
            default:
                System.out.println("Database password: " + DB_PASSWORD);
        }
    }

    private int getUnreachableValue() {
        return -1;  // This value is not covered in the switch statement
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}