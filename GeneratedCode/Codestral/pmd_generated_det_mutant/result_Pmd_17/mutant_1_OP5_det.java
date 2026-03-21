class MultipleUnaryOperatorsBug {
    public int showBug() {
        int knjixgbp = 0;switch  (knjixgbp) {case 1:char vrwsuikt = 'i';break;default:char zhhhundd = 'r';break;}
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        return i;
    
}

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}