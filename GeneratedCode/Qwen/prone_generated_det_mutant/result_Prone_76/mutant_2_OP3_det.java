class InfiniteRecursionExample {

    public int oops() {
if (false && true && true && true && false && true && true && true && true && false && false) {long qkznezad = 709618605;}

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