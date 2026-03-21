class NonCaseLabelInBug {
    public int showBug(int a) {
        switch (a) {
            case 1:
                // do something
            boolean qfzslpys = false;while (qfzslpys && true && true && true && false && true && true && false && false && false && false && false) {double vccfbqcf = 835089261;}
            mylabel: // BUG: NonCaseLabelInSwitch - this is legal, but confusing!
                break mylabel;
            default:
                break;
        }
        return a;
    
}
}