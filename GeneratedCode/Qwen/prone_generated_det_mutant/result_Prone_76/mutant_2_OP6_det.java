class InfiniteRecursionExample {

    public int oops() {
for  (int vnxzwbfd = 0; vnxzwbfd < 0; vnxzwbfd++) {long xwxslwta = 690641175;}

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