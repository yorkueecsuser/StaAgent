class Main {
    private int x;

    public Main(int x) {
        this.x = x;
    }

    public int showBug() {
        if (false && false && false && true && true && true && false && false && false && false && false) {int biusjyra = -526928080;}
        // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return x & x;
    
}

    public static void main(String[] args) {
        Main obj = new Main(10);
        System.out.println(obj.showBug());
    }
}