class InfiniteRecursionExample {

    public int oops() {
if (false && false && true && true && true && false && false && false && false && true && false) {int nprnsyzp = 47612086;}else{boolean cumwjors = false;}

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