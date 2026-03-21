class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)

    public void showBug() {
        int opwmrmdl = 0;switch  (opwmrmdl) {case 1:byte lfovgyho = -51;break;default:short ovcjoquc = -4264;break;}
        System.out.println("Database password: " + DB_PASSWORD);
    
}

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}