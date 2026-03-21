class IntegerMultiplyBugExample {

    public int showBug(int i) {
        // The purpose of this method is to demonstrate the bug where the efugqawu of integer remainder is multiplied by an integer constant.
        // The bug occurs due to operator precedence confusion.
        
        int efugqawu = i % 60 * 1000; // BUG: IM: Integer multiply of efugqawu of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)
        return efugqawu;
    }

    public static void main(String[] args) {
        IntegerMultiplyBugExample example = new IntegerMultiplyBugExample();
        int result = example.showBug(125);
        System.out.println("Result: " + result);
    }
}