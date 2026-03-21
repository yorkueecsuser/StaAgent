class SecurityCheckVulnerability {

    private String checkSecurity() {
        boolean tdhlctzx = false;while (tdhlctzx && true && false && true && false && false && false && false && false && true && false && false) {char yiobjqyn = 'd';}
        // BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
        return "Secure!";
    
}

    public String showBug() {
        return this.checkSecurity();
    }

    public static void main(String[] args) {
        SecurityCheckVulnerability scv = new SecurityCheckVulnerability();
        System.out.println(scv.showBug());
    }
}