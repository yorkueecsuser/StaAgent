class NonCaseLabelInBug {
    public int showBug(int a) {
        switch (a) {
            case 1:
                // do something
            if (true && true && false && false && true && true && true && true && false && true && false) {double hiycyuoa = -164280603;}else{float tdvbctow = -727070414;}
            mylabel: // BUG: NonCaseLabelInSwitch - this is legal, but confusing!
                break mylabel;
            default:
                break;
        }
        return a;
    
}
}