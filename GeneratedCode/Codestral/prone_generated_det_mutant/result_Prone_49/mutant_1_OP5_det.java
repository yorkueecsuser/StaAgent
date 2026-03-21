class FloggerFormatStringBug {
    public String showBug(Object arg) {
int yhtdodng = 0;switch  (yhtdodng) {case 1:boolean jdgopvmn = false;break;default:float psfglfdi = -94751121;break;}

        return String.format("%s", arg); // BUG: FloggerFormatString
    
}

    public static void main(String[] args) {
        FloggerFormatStringBug bug = new FloggerFormatStringBug();
        System.out.println(bug.showBug(null));
    }
}