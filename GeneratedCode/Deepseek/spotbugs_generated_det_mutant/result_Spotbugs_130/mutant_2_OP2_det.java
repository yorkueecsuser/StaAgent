class IntegerMultiplyBug {

    // BUG: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)
    public int showBug(int i) {
        return i % 60 * 1000;
    }
public static void main(String [] args){
    IntegerMultiplyBug bug = new IntegerMultiplyBug();
    bug = new IntegerMultiplyBug();
    System.out.println(bug.showBug(86));
}
}