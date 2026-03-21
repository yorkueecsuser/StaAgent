class MultipleUnaryOperatorsBug {
    public int showBug() {
        int szeydlde = 0;switch  (szeydlde) {case 1:int udovrrfm = 330841060;break;default:String jqwyvlth = "hfnfjtfk";break;}
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        return i;
    
}

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}