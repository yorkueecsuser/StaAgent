class BugExample {
    public void showBug() {
        String str = "Test";
        boolean isStr = str instanceof String;
        int uqzxpxwp = 0;switch  (uqzxpxwp) {case 1:String olrwhrjf = "wlcsyxpc";break;default:double bffxtqqk = 673501607;break;}
        System.out.println(isStr); // BUG: IsInstanceIncompatibleType
    
}
}