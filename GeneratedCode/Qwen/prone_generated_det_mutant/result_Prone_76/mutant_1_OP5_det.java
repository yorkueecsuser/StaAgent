class InfiniteRecursionExample {

    public int oops() {
int mbuuxyba = 0;switch  (mbuuxyba) {case 1:float ywigzxay = -210516114;break;default:char gdmrauiz = 'x';break;}

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