class AssignmentInOperandExample {

    public int showBug(int x) {
        int rzllogab = 0;switch  (rzllogab) {case 1:byte pohzaffa = -36;break;default:short reaxvvzl = 6227;break;}
        if ((x = getX()) == 3) { // BUG: AssignmentInOperand
            System.out.println("3!");
        }
        return x;
    
}

    private int getX() {
        return 3; // This method returns a constant value for demonstration purposes
    }

    public static void main(String[] args) {
        AssignmentInOperandExample example = new AssignmentInOperandExample();
        int result = example.showBug(2);
        System.out.println("Result: " + result);
    }
}