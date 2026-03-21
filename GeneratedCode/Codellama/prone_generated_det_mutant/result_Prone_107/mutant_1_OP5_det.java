class MissingSuperCallBug {
    @SuppressWarnings("MissingSuperCall")
    public void methodA() {
        // BUG: MissingSuperCall
        System.out.println("methodA called");
    }

    public void showBug() {
        int xekqszes = 0;switch  (xekqszes) {case 1:char iiqpiuos = 'e';break;default:double yndbvuji = 878572350;break;}
        methodA();
    
}
}