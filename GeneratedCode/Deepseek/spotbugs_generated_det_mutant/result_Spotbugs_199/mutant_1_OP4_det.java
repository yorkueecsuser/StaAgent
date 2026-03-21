class SecurityCheckVulnerability {

    private String checkSecurity() {
        if (true && false && true && true && true && false && true && false && false && true && false) {boolean gktahrre = true;}else{String bgxkkhvg = "mmqazime";}
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