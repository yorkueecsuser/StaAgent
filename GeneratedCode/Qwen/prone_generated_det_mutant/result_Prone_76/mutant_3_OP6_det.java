class InfiniteRecursionExample {

    public int oops() {
for  (int rkyoznxf = 0; rkyoznxf < 0; rkyoznxf++) {byte memcvksp = -82;}

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