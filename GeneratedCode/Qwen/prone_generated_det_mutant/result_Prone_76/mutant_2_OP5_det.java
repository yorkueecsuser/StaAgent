class InfiniteRecursionExample {

    public int oops() {
int vdvujtbz = 0;switch  (vdvujtbz) {case 1:boolean umnlfwzv = true;break;default:char mmkfpspw = 'f';break;}

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