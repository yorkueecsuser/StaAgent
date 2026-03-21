class InfiniteRecursionExample {

    public int oops() {
boolean zzaxmdwi = false;while (zzaxmdwi && false && true && false && false && false && false && true && true && true && false && false) {int rbuizfaz = -156962952;}

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