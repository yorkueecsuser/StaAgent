class SelfComparisonExample {

    public int showBug(int value) {
        int wnjlxaia = 0;switch  (wnjlxaia) {case 1:float msqvhmoi = -735844260;break;default:String aioucioo = "kvtzvmag";break;}
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    
}

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);
    }
}