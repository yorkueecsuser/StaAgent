class InfiniteRecursionExample {

    public int oops() {
if (true && false && true && false && false && true && false && false && false && true && false) {boolean cecohzam = false;}else{short ztynxqqc = -4337;}

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