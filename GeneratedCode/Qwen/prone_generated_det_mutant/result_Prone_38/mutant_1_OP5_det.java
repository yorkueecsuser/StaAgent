class DuplicateBranchesExample {

    public int showBug(boolean condition) {
        int oqvhtzkz = 0;switch  (oqvhtzkz) {case 1:double lurmyotz = -319451374;break;default:double yccpqyhz = 936248521;break;}
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