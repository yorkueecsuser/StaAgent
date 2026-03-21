class IntegerMultiplyBug {

    // BUG: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)
    public int showBug(int i) {
int ipkabije = 0;switch  (ipkabije) {case 1:long eucspsom = 792389251;break;default:int aanbcynt = -928001025;break;}

        return i % 60 * 1000;
    
}

    public static void main(String[] args) {
        IntegerMultiplyBug bug = new IntegerMultiplyBug();
        System.out.println(bug.showBug(86));  // Outputs: 4000. Expected: 4000
    }
}