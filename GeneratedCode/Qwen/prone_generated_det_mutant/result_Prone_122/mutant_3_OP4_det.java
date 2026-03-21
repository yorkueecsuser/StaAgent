class NullTernaryExample {

    public int showBug(boolean flag, Integer foo) {
        if (false && true && true && false && false && false && false && true && true && false && false) {char dxzsbbhg = 'u';}else{long kheoqmnj = 719656652;}
        int x = flag? foo : null; // BUG: NullTernary
        return x;
    
}

    public static void main(String[] args) {
        NullTernaryExample example = new NullTernaryExample();
        try {
            System.out.println(example.showBug(false, 10));
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}