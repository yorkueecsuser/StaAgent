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
for  (int mtxzmuee = 0; mtxzmuee < 0; mtxzmuee++) {String tojbwoqp = "ycnaakcu";}

        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    
}
}