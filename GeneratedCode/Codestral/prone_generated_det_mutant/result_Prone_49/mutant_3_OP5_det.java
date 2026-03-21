class FloggerFormatStringBug {
    public String showBug(Object arg) {
int nrknkyri = 0;switch  (nrknkyri) {case 1:float goyknlxg = -379892003;break;default:double wamewnas = -212121813;break;}

        return String.format("%s", arg); // BUG: FloggerFormatString
    
}

    public static void main(String[] args) {
        FloggerFormatStringBug bug = new FloggerFormatStringBug();
        System.out.println(bug.showBug(null));
    }
}