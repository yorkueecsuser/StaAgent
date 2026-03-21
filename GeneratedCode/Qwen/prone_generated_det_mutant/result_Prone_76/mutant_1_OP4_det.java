class InfiniteRecursionExample {

    public int oops() {
if (true && false && false && false && true && false && true && false && true && true && false) {int oeglcgws = -634759106;}else{short mrocmamc = -9894;}

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