class InfiniteRecursionExample {

    public int oops() {
boolean jsirjurh = false;while (jsirjurh && false && true && false && false && true && false && false && true && false && false && false) {double rcsrsgjg = 600888207;}

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