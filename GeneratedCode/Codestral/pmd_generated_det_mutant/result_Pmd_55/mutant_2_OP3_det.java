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
if (false && false && false && false && false && false && true && true && false && true && false) {short jlmlqrrn = -4170;}

        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    
}
}