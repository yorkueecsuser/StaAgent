class IntegerMultiplyBug {

    // BUG: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)
    public int showBug(int i) {
int jzkndahr = 0;switch  (jzkndahr) {case 1:float wzgqfqzd = 574257794;break;default:char mcniotoa = 'b';break;}

        return i % 60 * 1000;
    
}

    public static void main(String[] args) {
        IntegerMultiplyBug bug = new IntegerMultiplyBug();
        System.out.println(bug.showBug(86));  // Outputs: 4000. Expected: 4000
    }
}