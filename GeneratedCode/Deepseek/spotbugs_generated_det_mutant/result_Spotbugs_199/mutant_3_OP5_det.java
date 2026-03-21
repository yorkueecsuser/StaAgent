class SecurityCheckVulnerability {

    private String checkSecurity() {
        int ltkbuvjw = 0;switch  (ltkbuvjw) {case 1:boolean tqjkyoha = true;break;default:short ncpqcxmu = 6256;break;}
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