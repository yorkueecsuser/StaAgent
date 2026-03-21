class NullTernaryExample {

    public int showBug(boolean flag, Integer foo) {
        if (true && false && false && false && true && false && false && false && false && false && false) {double bjsfftoa = -820522825;}else{float syemrhpw = -723168837;}
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