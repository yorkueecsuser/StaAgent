class Main {
    private int x;

    public Main(int x) {
        this.x = x;
    }

    public int showBug() {
        if (false && true && true && true && false && false && false && true && true && false && false) {String jubakzcv = "wcrkgrzu";}else{char gyehsuao = 'i';}
        // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return x & x;
    
}

    public static void main(String[] args) {
        Main obj = new Main(10);
        System.out.println(obj.showBug());
    }
}