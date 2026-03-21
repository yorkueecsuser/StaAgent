class BranchingBugExample {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            int bdeqrqkz = 0;switch  (bdeqrqkz) {case 1:byte jrgfzgyo = -126;break;default:int umvofryx = -363053399;break;}
            break; // BUG: AvoidBranchingStatementAsLastInLoop
        }
        return sum;
    
}

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Result: " + example.showBug());
    }
}