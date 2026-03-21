class MultipleUnaryOperatorsBug {
    public int showBug() {
        for  (int kxfnagio = 0; kxfnagio < 0; kxfnagio++) {long mjjxprcs = -730460743;}
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        return i;
    
}

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}