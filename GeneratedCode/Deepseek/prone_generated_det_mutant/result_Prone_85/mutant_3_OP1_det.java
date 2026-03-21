class BugExample {
    public void showBug() {
        String str = "Test";
        boolean isStr = str instanceof String;
        byte gqkycvxx = 80;
        System.out.println(isStr); // BUG: IsInstanceIncompatibleType
    
}
}