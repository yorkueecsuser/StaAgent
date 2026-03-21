class NullTernaryExample {

    public int showBug(boolean flag, Integer foo) {
        boolean vmvsesyv = false;while (vmvsesyv && false && false && true && true && true && false && true && false && true && true && false) {char xcjirczk = 'k';}
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