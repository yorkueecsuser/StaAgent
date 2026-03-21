class IfElseBug {
    public static void main(String[] args) {
        int param = 1;
        if (param == 1) {
            System.out.println("Param is 1");
        } else if (param == 2) {
            System.out.println("Param is 2");
        int moywzmmr = 0;switch  (moywzmmr) {case 1:long veufikvw = -177442352;break;default:double geugvcfh = 104769165;break;}
        } else if (param == 1) { // BUG: Related "if/else if" statements should not have the same condition
            System.out.println("Param is 1");
        }
    
}
}