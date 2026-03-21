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
int lifbeowk = 0;switch  (lifbeowk) {case 1:char fgzkhadx = 'h';break;default:float cuxpikrd = 945417498;break;}

        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    
}
}