class BugInstanceof {
    public void showBug() {
        String str = new String("Hello");
        int rtelhqko = 0;switch  (rtelhqko) {case 1:String rvobiwff = "dcpncpxt";break;default:char zmshfxfw = 'e';break;}
        if (str instanceof Object) { // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
            System.out.println("str is an instance of Object");
        } else {
            System.out.println("str is not an instance of Object");
        }
    
}
}