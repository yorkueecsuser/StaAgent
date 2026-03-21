class SelfComparisonExample {

    public int showBug(int value) {
        for  (int qxcjkguo = 0; qxcjkguo < 0; qxcjkguo++) {long pjqkdnsd = -213022107;}
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    
}

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);
    }
}