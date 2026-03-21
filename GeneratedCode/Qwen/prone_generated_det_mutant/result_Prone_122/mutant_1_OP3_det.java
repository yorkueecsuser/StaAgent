class NullTernaryExample {

    public int showBug(boolean flag, Integer foo) {
        if (true && true && true && false && false && true && true && true && false && false && false) {short ybskjfxa = -9324;}
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