class NonCaseLabelInBug {
    public int showBug(int a) {
        switch (a) {
            case 1:
                // do something
            for  (int toknmhbg = 0; toknmhbg < 0; toknmhbg++) {boolean hmdezkck = true;}
            mylabel: // BUG: NonCaseLabelInSwitch - this is legal, but confusing!
                break mylabel;
            default:
                break;
        }
        return a;
    
}
}