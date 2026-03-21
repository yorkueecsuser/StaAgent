class SecurityCheckVulnerability {

    private String checkSecurity() {
        int aloqzmiu = 0;switch  (aloqzmiu) {case 1:int pukahsjb = 948958433;break;default:long wkoszyrz = -236872349;break;}
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