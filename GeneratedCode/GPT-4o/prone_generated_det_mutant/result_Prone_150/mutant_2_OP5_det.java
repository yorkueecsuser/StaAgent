class SelfComparisonExample {

    public int showBug(int value) {
        int brkvqfeq = 0;switch  (brkvqfeq) {case 1:char zjfdcmjw = 'j';break;default:String piejjylc = "qsdukrmq";break;}
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    
}

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);
    }
}