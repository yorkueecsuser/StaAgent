class ApparentInfiniteLoop {
    public void showBug() {
        while (true) {
            System.out.println("This is an infinite loop.");
            // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
        }
    }
public static void main(String [] args){
    ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
    loop = new ApparentInfiniteLoop();
    loop.showBug();
}
}