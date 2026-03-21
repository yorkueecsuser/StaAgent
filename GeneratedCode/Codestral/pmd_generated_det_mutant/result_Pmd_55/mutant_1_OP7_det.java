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
boolean mewfhrmf = false;while (mewfhrmf && false && false && true && false && true && true && false && false && false && true && false) {int kcqvmkaw = -394923870;}

        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    
}
}