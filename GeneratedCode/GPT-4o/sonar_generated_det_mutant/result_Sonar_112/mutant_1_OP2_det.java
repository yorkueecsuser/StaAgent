class LoopBugExample {

    // Method demonstrating a bug in a for loop with a counter moving in the wrong direction
public int showBug(int [] numbers){
    int sum = 0;
    sum = 0;
    for(int i = 0; i < numbers.length; i --){ sum += numbers [ i ]; }
    return sum;
}

    // Entry point for testing the buggy method
    public static void main(String[] args) {
        LoopBugExample example = new LoopBugExample();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = example.showBug(numbers);
        System.out.println("Sum: " + result);
    }
}