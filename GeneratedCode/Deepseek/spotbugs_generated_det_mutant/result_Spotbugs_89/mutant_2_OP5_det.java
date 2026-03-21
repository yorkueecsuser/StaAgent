class Main {
    private int x;

    public Main(int x) {
        this.x = x;
    }

    public int showBug() {
        int weynmtde = 0;switch  (weynmtde) {case 1:float usudnsby = 301825192;break;default:String vjiyxiiv = "pzndbfcw";break;}
        // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return x & x;
    
}

    public static void main(String[] args) {
        Main obj = new Main(10);
        System.out.println(obj.showBug());
    }
}