class NonCaseLabelInBug {
    public int showBug(int a) {
        switch (a) {
            case 1:
                // do something
            mylabel: // BUG: NonCaseLabelInSwitch - this is legal, but confusing!
                break mylabel;
            default:
                break;
        }
        return a;
    }
}