class InfiniteLoopExample {
public void showBug() {
    int counter = 0;
    counter = 0;
    while(true){ System.out.println("This is an infinite loop iteration: " + counter); counter ++; if(counter < 0){ break; } }
}

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}