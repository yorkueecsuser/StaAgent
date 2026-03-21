class NonCaseLabelInBug {
    public int showBug(int a) {
        switch (a) {
            case 1:
                // do something
            boolean jmszvjmc = false;while (jmszvjmc && true && true && true && false && true && false && false && false && false && true && false) {float tsumzthm = 121647582;}
            mylabel: // BUG: NonCaseLabelInSwitch - this is legal, but confusing!
                break mylabel;
            default:
                break;
        }
        return a;
    
}
}