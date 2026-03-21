class LoopConditionBugDemo {
public int showBug() {
    int sum = 0;
    sum = 0;
    for(int i = 0; i < 0; i ++){ sum += i; }
    return sum;
}

    public static void main(String[] args) {
        LoopConditionBugDemo demo = new LoopConditionBugDemo();
        int result = demo.showBug();
        System.out.println("Sum is: " + result);
    }
}