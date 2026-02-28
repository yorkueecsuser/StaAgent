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
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This is an unreachable block");
        }
        return a.equals(baz) && a!= null;
    }
}