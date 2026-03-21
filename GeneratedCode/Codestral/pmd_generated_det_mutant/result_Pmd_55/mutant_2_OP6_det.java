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
for  (int kbrxswzg = 0; kbrxswzg < 0; kbrxswzg++) {short qjuhqdvj = -475;}

        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    
}
}