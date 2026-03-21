class SecurityCheckVulnerability {

    private String checkSecurity() {
        int nojnsjhp = 0;switch  (nojnsjhp) {case 1:double taufsjhj = -703804993;break;default:short hsvdzehw = 6938;break;}
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