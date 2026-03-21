class MissingSuperCallBug {
    @SuppressWarnings("MissingSuperCall")
    public void methodA() {
        // BUG: MissingSuperCall
        System.out.println("methodA called");
    }

    public void showBug() {
        int xjbkaunm = 0;switch  (xjbkaunm) {case 1:char qxfrcrxr = 'd';break;default:String tyxynuyj = "qlnwvlgl";break;}
        methodA();
    
}
}