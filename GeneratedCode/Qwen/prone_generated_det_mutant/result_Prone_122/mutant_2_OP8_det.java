class NullTernaryExample {

    public int showBug(boolean flag, Integer foo) {
        int vbqvylmg = flag? foo : null; // BUG: NullTernary
        return vbqvylmg;
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