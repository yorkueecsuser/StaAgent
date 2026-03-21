class NonCaseLabelInBug {
    public int showBug(int a) {
        switch (a) {
            case 1:
                // do something
            if (false && false && false && false && false && true && false && false && false && true && false) {boolean haydeqlh = false;}else{byte kptnymam = 46;}
            mylabel: // BUG: NonCaseLabelInSwitch - this is legal, but confusing!
                break mylabel;
            default:
                break;
        }
        return a;
    
}
}