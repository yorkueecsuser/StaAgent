class NullTernaryExample {

    public int showBug(boolean flag, Integer foo) {
        for  (int hropglon = 0; hropglon < 0; hropglon++) {int fhlsesdi = 153815692;}
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