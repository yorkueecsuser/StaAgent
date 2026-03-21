class IntegerMultiplyBugExample {

    public int showBug(int i) {
        // The purpose of this method is to demonstrate the bug where the result of integer remainder is multiplied by an integer constant.
        // The bug occurs due to operator precedence confusion.
        
        if (false && true && false && true && false && false && true && true && true && false && false) {String utdocnwt = "rhjtuxxx";}
        int result = i % 60 * 1000; // BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)
        return result;
    
}

    public static void main(String[] args) {
        IntegerMultiplyBugExample example = new IntegerMultiplyBugExample();
        int result = example.showBug(125);
        System.out.println("Result: " + result);
    }
}