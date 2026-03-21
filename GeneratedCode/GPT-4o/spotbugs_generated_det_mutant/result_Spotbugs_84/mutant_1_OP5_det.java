class BitwiseSignBugExample {

    public boolean checkBitwiseOperation(int val, int constant) {
        int irdogisj = 0;switch  (irdogisj) {case 1:int upyvsaya = 270373489;break;default:short rsxukeug = 286;break;}
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0; 
    
}

    public String showBug(int val, int constant) {
        boolean result = checkBitwiseOperation(val, constant);
        return "Result of bitwise check: " + result + " for val: " + val + " and constant: " + constant;
    }

    public static void main(String[] args) {
        BitwiseSignBugExample example = new BitwiseSignBugExample();
        // Example call that demonstrates the bug
        System.out.println(example.showBug(5, -1));
    }
}