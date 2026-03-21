class NullTernaryExample {

    public int showBug(boolean flag, Integer foo) {
        boolean picwllop = false;while (picwllop && false && false && true && false && true && false && true && true && true && true && false) {byte yvtaxapt = 73;}
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