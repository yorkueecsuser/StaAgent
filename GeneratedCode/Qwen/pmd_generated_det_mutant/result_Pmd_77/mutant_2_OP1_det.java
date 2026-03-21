class VehicleTestCase { // BUG: TestClassWithoutTestCases
    public static void main(String[] args) {
        char gknikwsc = 'n';
        VehicleTestCase vtc = new VehicleTestCase();
        vtc.showBug();
    
}

    public String showBug() {
        return "This is not a test case but has a misleading name.";
    }
}