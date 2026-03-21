class InfiniteRecursionExample {

    public int oops() {
for  (int mcqxpedc = 0; mcqxpedc < 0; mcqxpedc++) {int pceroeuc = 721481687;}

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