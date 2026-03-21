class IntegerMultiplyBugExample {
public int showBug(int i){
    int result = i % 60 * 1000;
    result = i % 60 * 1000;
    return result;
}

    public static void main(String[] args) {
        IntegerMultiplyBugExample example = new IntegerMultiplyBugExample();
        int result = example.showBug(125);
        System.out.println("Result: " + result);
    }
}