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
if (true && false && false && false && false && true && false && false && false && false && false) {float ijykdwpy = -533066150;}else{String rmslgzlo = "sydcqbym";}

        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    
}
}