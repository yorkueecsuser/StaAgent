class LoopConditionCheckerExample {
public int showBug(int start){
    int counter = start;
    counter = start;
    while(counter < 10){ System.out.println("Counter is " + counter); }
    return counter;
}

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5);
    }
}