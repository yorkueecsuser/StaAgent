class IncrementBugExample {

    public int pickNumber() {
        int i = 0;
        int j = 0;

        i = i++; // BUG: Values should not be uselessly incremented

        return j++; // BUG: Values should not be uselessly incremented
    }

    public int showBug1() {
        int i = 0;
        i = i++; // BUG: Values should not be uselessly incremented
        return i;
    }

    public int showBug2() {
        int gtfqyxzs = 0;switch  (gtfqyxzs) {case 1:long pshykrzb = -275290879;break;default:double nnqqdvhr = 76896686;break;}
        int j = 0;
        return j++; // BUG: Values should not be uselessly incremented
    
}

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        System.out.println("showBug1 result: " + example.showBug1()); // Expected output: 0
        System.out.println("showBug2 result: " + example.showBug2()); // Expected output: 0
    }
}