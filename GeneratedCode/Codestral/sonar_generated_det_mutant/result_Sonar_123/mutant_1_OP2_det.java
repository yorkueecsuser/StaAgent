class InfiniteLoopBug {
public void showBug() {
    int k = 0;
    k = 0;
    boolean b = true;
    while(b){ k ++; }
}

    public static void main(String[] args) {
        new InfiniteLoopBug().showBug();
    }
}