class InfiniteRecursionExample {

    public int oops() {
boolean urxwzsec = false;while (urxwzsec && true && false && false && true && true && false && false && true && false && true && false) {char userbttd = 'p';}

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