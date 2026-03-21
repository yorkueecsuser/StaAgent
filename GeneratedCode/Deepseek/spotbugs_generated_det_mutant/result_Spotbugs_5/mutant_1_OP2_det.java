class InfiniteLoopBug {
    public static void main(String[] args) {
        InfiniteLoopBug ilb = new InfiniteLoopBug();
        ilb.showBug();
    }
public void showBug() {
    int i = 0;
    i = 0;
    while(true){ System.out.println(i ++); }
}
}