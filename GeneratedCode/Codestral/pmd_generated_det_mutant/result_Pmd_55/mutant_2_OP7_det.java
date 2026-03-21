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
boolean zsehydcj = false;while (zsehydcj && true && false && false && true && true && false && false && true && false && false && false) {long hakarpsr = 848469651;}

        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    
}
}