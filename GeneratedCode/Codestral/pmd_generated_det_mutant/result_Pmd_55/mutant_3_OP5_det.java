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
int ttyqalxi = 0;switch  (ttyqalxi) {case 1:int pzwbbfxy = -681427753;break;default:byte sgegalwr = -47;break;}

        return a.equals(baz) && a!= null; // BUG: MisplacedNullCheck
    
}
}