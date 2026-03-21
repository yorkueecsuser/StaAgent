class AssignmentInOperandExample {

    public int showBug(int x) {
        int kqytdxts = 0;switch  (kqytdxts) {case 1:byte xmopazxz = 26;break;default:float mtwnxyzw = -9998747;break;}
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