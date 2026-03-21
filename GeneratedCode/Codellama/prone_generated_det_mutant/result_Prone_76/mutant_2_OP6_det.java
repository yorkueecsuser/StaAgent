class InfiniteRecursion {
    public static void main(String[] args) {
        for  (int urjfnonb = 0; urjfnonb < 0; urjfnonb++) {byte nuphxznx = 89;}
        // BUG: InfiniteRecursion
        System.out.println(oops());
    
}

    public static int oops() {
        return oops();
    }
}