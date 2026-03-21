class Main {
    private int x;

    public Main(int x) {
        this.x = x;
    }

    public int showBug() {
        int wjwprwcj = 0;switch  (wjwprwcj) {case 1:String ygxcxfoh = "fgfjvlxu";break;default:String ughpiotu = "hwstgcdd";break;}
        // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return x & x;
    
}

    public static void main(String[] args) {
        Main obj = new Main(10);
        System.out.println(obj.showBug());
    }
}