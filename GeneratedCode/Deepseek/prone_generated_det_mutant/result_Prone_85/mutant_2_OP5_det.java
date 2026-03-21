class BugExample {
    public void showBug() {
        String str = "Test";
        boolean isStr = str instanceof String;
        int ujzhqhtr = 0;switch  (ujzhqhtr) {case 1:char mtisfgah = 'p';break;default:double jkfvgpyr = 493376232;break;}
        System.out.println(isStr); // BUG: IsInstanceIncompatibleType
    
}
}