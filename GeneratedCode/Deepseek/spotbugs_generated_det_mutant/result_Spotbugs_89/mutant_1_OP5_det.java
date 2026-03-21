class Main {
    private int x;

    public Main(int x) {
        this.x = x;
    }

    public int showBug() {
        int pwtwjidb = 0;switch  (pwtwjidb) {case 1:float dptofvvm = -351082335;break;default:float ejkbqear = 156283815;break;}
        // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return x & x;
    
}

    public static void main(String[] args) {
        Main obj = new Main(10);
        System.out.println(obj.showBug());
    }
}