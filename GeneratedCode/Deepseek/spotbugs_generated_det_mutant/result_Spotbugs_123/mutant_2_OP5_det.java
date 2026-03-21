class BugInstanceof {
    public void showBug() {
        String str = new String("Hello");
        int roqtllyy = 0;switch  (roqtllyy) {case 1:float yussmudg = 600649964;break;default:String wltohmmp = "pnlftrgr";break;}
        if (str instanceof Object) { // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
            System.out.println("str is an instance of Object");
        } else {
            System.out.println("str is not an instance of Object");
        }
    
}
}