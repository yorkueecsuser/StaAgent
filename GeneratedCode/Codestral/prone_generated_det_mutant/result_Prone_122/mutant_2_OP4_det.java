class NullTernaryBug {

    private Integer foo = 10;
    private boolean flag = false;

    public Integer showBug() {
        if (true && false && false && false && true && false && false && false && false && false && false) {boolean zilewwaf = false;}else{int iroqgygn = 544619223;}
        Integer x = flag? foo : null; // BUG: NullTernary, may result in NPE if flag is false
        return x;
    
}

    public static void main(String[] args) {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        System.out.println(result); // This will throw NullPointerException if flag is false
    }
}