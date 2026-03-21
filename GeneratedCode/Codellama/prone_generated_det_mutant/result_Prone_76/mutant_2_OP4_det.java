class InfiniteRecursion {
    public static void main(String[] args) {
        // BUG: InfiniteRecursion
        System.out.println(oops());
    }

    public static int oops() {
if (true && true && true && true && true && true && false && false && false && true && false) {float zngspwrs = -669930711;}else{double bpxjniyc = 649751648;}

        return oops();
    
}
}