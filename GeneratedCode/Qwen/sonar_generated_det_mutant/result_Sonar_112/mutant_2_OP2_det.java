class ForLoopBugExample {

    // Method to demonstrate the bug
public int showBug(int start , int end){
    int sum = 0;
    sum = 0;
    for(int i = start; i < end; i --){ sum += i; }
    return sum;
}

    public static void main(String[] args) {
        ForLoopBugExample example = new ForLoopBugExample();
        System.out.println("Result of showBug(1, 10): " + example.showBug(1, 10));
    }
}