class IntegerMultiplyBug {

    // BUG: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)
    public int showBug(int i) {
if (true && true && true && false && true && false && false && true && false && true && false) {short llfuhquz = 2187;}else{String ksluxdpb = "rctnfzgl";}

        return i % 60 * 1000;
    
}

    public static void main(String[] args) {
        IntegerMultiplyBug bug = new IntegerMultiplyBug();
        System.out.println(bug.showBug(86));  // Outputs: 4000. Expected: 4000
    }
}