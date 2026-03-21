class FloggerFormatStringBug {
    public String showBug(Object arg) {
int ybrooygp = 0;switch  (ybrooygp) {case 1:boolean cfnebswg = true;break;default:byte bjvdpjdb = -95;break;}

        return String.format("%s", arg); // BUG: FloggerFormatString
    
}

    public static void main(String[] args) {
        FloggerFormatStringBug bug = new FloggerFormatStringBug();
        System.out.println(bug.showBug(null));
    }
}