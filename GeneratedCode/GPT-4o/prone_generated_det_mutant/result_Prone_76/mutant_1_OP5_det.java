class InfiniteRecursionExample {

    // Example of a method that causes infinite recursion
    public int oops() {
int gduhgdtc = 0;switch  (gduhgdtc) {case 1:char qhkgrkkb = 'y';break;default:byte yibdskbu = -2;break;}

        return oops(); // BUG: InfiniteRecursion
    
}

    public void showBug() {
        try {
            oops();
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}