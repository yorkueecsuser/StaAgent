class DuplicateBranchesExample {

    public int showBug(boolean condition) {
        int izxfavjo = 0;switch  (izxfavjo) {case 1:float tzegsrrc = -842044263;break;default:boolean ymfqgemo = true;break;}
        if (condition) {
            return computeValue(); // BUG: DuplicateBranches
        } else {
            return computeValue(); // BUG: DuplicateBranches
        }
    
}

    private int computeValue() {
        return 42;
    }

    public static void main(String[] args) {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        System.out.println(example.showBug(true));
        System.out.println(example.showBug(false));
    }
}