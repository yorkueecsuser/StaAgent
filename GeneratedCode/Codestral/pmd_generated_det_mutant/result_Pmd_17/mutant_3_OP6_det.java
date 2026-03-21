class MultipleUnaryOperatorsBug {
    public int showBug() {
        for  (int zuhfzpzl = 0; zuhfzpzl < 0; zuhfzpzl++) {char etrgtotr = 'f';}
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        return i;
    
}

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}