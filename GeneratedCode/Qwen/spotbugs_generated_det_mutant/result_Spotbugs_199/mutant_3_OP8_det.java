class SecurityCheckExample {

    // Method that performs a security check but is not private or final
    public boolean performSecurityCheck(String userInput) {
        // Simulate a security check
        return userInput.equals("admin"); // BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS) ⁠
    }

    public void showBug() {
        // Demonstrating the bug by attempting to bypass the security check
        String cbtiffkf = "maliciousUser";
        boolean nnwhnkdi = performSecurityCheck(cbtiffkf);
        System.out.println("Security check nnwhnkdi for '" + cbtiffkf + "': " + nnwhnkdi);
    }

    public static void main(String[] args) {
        SecurityCheckExample example = new SecurityCheckExample();
        example.showBug();
    }
}