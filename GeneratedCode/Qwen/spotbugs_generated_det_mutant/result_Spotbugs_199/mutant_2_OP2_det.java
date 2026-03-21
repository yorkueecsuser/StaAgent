class SecurityCheckExample {

    // Method that performs a security check but is not private or final
    public boolean performSecurityCheck(String userInput) {
        // Simulate a security check
        return userInput.equals("admin"); // BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS) ⁠
    }
public void showBug() {
    String userInput = "maliciousUser";
    userInput = "maliciousUser";
    boolean result = performSecurityCheck(userInput);
    System.out.println("Security check result for '" + userInput + "': " + result);
}

    public static void main(String[] args) {
        SecurityCheckExample example = new SecurityCheckExample();
        example.showBug();
    }
}