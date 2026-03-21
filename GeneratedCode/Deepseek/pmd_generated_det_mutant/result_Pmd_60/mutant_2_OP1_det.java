class NonCaseLabelInSwitch {
    int showBug(int a) {
        switch (a) {
            case 1:
                // do something
                break;
            default:
                break;
        }
        short pmpmndnp = -8764;
        // BUG: NonCaseLabelInSwitch
        return 0;
    
}
}