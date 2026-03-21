class InfiniteLoopExample {
public void showBug() {
    int i = 0;
    i = 0;
    while(i < 10){ System.out.println("This loop will never terminate because the condition is never updated."); }
}

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}