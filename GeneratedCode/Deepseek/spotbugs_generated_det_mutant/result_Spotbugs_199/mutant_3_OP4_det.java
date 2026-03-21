class SecurityCheckVulnerability {

    private String checkSecurity() {
        if (true && true && true && true && true && true && true && true && true && false && false) {int uaisfmma = 616161935;}else{long dhpufind = 716399130;}
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