class BugInstanceof {
    public void showBug() {
        String str = new String("Hello");
        int pbrvcbvq = 0;switch  (pbrvcbvq) {case 1:double nkuqwrpg = 703076892;break;default:double wcxqnymo = -177869494;break;}
        if (str instanceof Object) { // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
            System.out.println("str is an instance of Object");
        } else {
            System.out.println("str is not an instance of Object");
        }
    
}
}