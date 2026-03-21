class NullTernaryExample {

    public int showBug(boolean flag, Integer foo) {
        if (false && false && true && false && false && false && true && true && false && true && false) {double wfmnefhe = 390305231;}else{boolean wtneyfrg = false;}
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