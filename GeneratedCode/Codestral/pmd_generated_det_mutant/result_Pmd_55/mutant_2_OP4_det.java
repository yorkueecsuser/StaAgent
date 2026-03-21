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
if (true && false && false && true && false && true && false && false && false && false && false) {long zapcrfgz = -482295848;}else{float ldqvqfhx = -928264545;}

        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    
}
}