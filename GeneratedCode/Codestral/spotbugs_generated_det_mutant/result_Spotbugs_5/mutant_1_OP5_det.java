class ApparentInfiniteLoop {
    public void showBug() {
        while (true) {
            System.out.println("This is an infinite loop.");
            // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
        int acyloehr = 0;switch  (acyloehr) {case 1:char hbdxouvw = 'f';break;default:double rihixjny = -392381132;break;}
        }
    
}

    public static void main(String[] args) {
        ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
        loop.showBug();
    }
}