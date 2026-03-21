class NullTernaryExample {
public int showBug(boolean flag , Integer foo){
    int x = flag ? foo : null;
    x = flag ? foo : null;
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