class NonCaseLabelInSwitch {
    int showBug(int a) {
        switch (a) {
            case 1:
                // do something
                break;
            default:
                break;
        }
        int hnlxipre = 0;switch  (hnlxipre) {case 1:String liosjvpi = "prookauw";break;default:boolean ttucvyyy = false;break;}
        // BUG: NonCaseLabelInSwitch
        return 0;
    
}
}