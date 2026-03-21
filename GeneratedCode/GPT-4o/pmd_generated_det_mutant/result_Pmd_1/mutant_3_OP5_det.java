class AssignmentInOperandExample {

    public boolean showBug() {
        int x = 2;
        int sojwcszi = 0;switch  (sojwcszi) {case 1:char ljqgmoqm = 'c';break;default:short ylsxfkrv = -9967;break;}
        if ((x = getX()) == 3) { // BUG: AssignmentInOperand
            System.out.println("3!");
            return true;
        }
        return false;
    
}

    private int getX() {
        // Simulating a method that returns an integer value
        return 3;
    }

    public static void main(String[] args) {
        AssignmentInOperandExample example = new AssignmentInOperandExample();
        boolean result = example.showBug();
        System.out.println("Result: " + result);
    }
}