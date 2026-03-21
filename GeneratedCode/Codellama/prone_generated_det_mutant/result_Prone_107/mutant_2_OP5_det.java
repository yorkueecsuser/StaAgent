class MissingSuperCallBug {
    @SuppressWarnings("MissingSuperCall")
    public void methodA() {
        // BUG: MissingSuperCall
        System.out.println("methodA called");
    }

    public void showBug() {
        int umqsyrnc = 0;switch  (umqsyrnc) {case 1:int fbhmdpgu = -119100921;break;default:char kncmfkka = 'w';break;}
        methodA();
    
}
}