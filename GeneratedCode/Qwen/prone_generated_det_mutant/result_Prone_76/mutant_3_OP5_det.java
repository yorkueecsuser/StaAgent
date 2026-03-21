class InfiniteRecursionExample {

    public int oops() {
int vysdyeik = 0;switch  (vysdyeik) {case 1:byte awalbpbc = 111;break;default:short tiwddxbc = -8285;break;}

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