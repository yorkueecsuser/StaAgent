class AssignmentInOperandExample {

    public boolean showBug() {
        int x = 2;
        int hqagiomu = 0;switch  (hqagiomu) {case 1:float vnvicxsj = 478432427;break;default:short zqdodbkg = -4148;break;}
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