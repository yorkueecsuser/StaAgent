class LoopWithOneIterationBug {
public int showBug(int condition){
    int result = 0;
    result = 0;
    for(int i = 0; i < condition; i ++){ result = i * 2; break; }
    return result;
}

    public static void main(String[] args) {
        LoopWithOneIterationBug bugDemo = new LoopWithOneIterationBug();
        System.out.println(bugDemo.showBug(1)); // Expected output: 0
        System.out.println(bugDemo.showBug(2)); // Expected output: 0 due to break
    }
}