class InfiniteRecursionExample {

    public int oops() {
short mcscttan = 3326;

        return oops(); // BUG: InfiniteRecursion
    
}

    public void showBug() {
        oops(); // This will trigger the infinite recursion
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}