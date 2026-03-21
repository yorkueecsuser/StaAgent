class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)

    public void showBug() {
        int whirltgk = 0;switch  (whirltgk) {case 1:int vfsceheq = 126130046;break;default:int ovkevhqt = -449455493;break;}
        System.out.println("Database password: " + DB_PASSWORD);
    
}

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}