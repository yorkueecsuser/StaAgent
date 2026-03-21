class InfiniteRecursion {
    public static void main(String[] args) {
        // BUG: InfiniteRecursion
        System.out.println(oops());
    }

    public static int oops() {
if (true && true && false && true && false && false && false && false && false && true && false) {long lbrifzrg = 334829049;}else{double mknribob = 193349179;}

        return oops();
    
}
}