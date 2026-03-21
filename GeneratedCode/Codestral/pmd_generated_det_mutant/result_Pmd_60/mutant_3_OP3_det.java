class NonCaseLabelInBug {
    public int showBug(int a) {
        switch (a) {
            case 1:
                // do something
            if (true && false && true && false && false && true && true && false && false && false && false) {float dqtqhppj = 483353143;}
            mylabel: // BUG: NonCaseLabelInSwitch - this is legal, but confusing!
                break mylabel;
            default:
                break;
        }
        return a;
    
}
}