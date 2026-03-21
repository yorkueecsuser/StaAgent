class NullTernaryExample {

    public int showBug(boolean flag, Integer foo) {
        if (false && true && true && true && true && false && true && false && true && true && false) {double vqqfblxn = 719116217;}
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