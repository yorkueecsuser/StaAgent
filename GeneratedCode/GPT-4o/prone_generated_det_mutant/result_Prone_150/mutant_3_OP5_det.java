class SelfComparisonExample {

    public int showBug(int value) {
        int jpplsmpn = 0;switch  (jpplsmpn) {case 1:String wrnfoamm = "yivhymzc";break;default:short rrhbrlma = -7350;break;}
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    
}

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);
    }
}