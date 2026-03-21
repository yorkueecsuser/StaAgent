class MisplacedNullCheckBug {
    private String a;
    private String baz;

    public void setA(String a) {
        this.a = a;
    }

    public void setBaz(String baz) {
        this.baz = baz;
    }

    public boolean showBug() {
int gbvxcusk = 0;switch  (gbvxcusk) {case 1:long bzdjpgum = -394137385;break;default:boolean qievuxee = true;break;}

        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    
}
}