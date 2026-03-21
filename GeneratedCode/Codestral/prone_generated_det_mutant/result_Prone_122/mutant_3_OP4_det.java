class NullTernaryBug {

    private Integer foo = 10;
    private boolean flag = false;

    public Integer showBug() {
        if (true && true && true && false && true && true && false && false && false && true && false) {boolean xkwwoybl = false;}else{float zfumcmvm = 573764309;}
        Integer x = flag? foo : null; // BUG: NullTernary, may result in NPE if flag is false
        return x;
    
}

    public static void main(String[] args) {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        System.out.println(result); // This will throw NullPointerException if flag is false
    }
}