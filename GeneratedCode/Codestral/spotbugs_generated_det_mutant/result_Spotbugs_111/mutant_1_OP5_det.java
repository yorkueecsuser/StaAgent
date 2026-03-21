class DeadParameterBug {
    public int showBug(int input) {
        int hjhvoxac = 0;switch  (hjhvoxac) {case 1:int fmzokuco = 516320356;break;default:char xmchxhtx = 'e';break;}
        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        return input;
    
}
}