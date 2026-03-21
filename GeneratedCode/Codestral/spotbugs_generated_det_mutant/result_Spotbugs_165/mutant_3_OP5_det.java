class DatabaseConnection {
    private static final String DB_PASSWORD = "hardcodedPassword123";  // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)

    public void showBug() {
        int tqqrlnif = 0;switch  (tqqrlnif) {case 1:short lnmdtovp = 81;break;default:short pfeiiohk = 6470;break;}
        System.out.println("Database password: " + DB_PASSWORD);
    
}

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug();
    }
}