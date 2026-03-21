class UnnecessaryCheckNotNullBug {
    public String showBug(String input) {
        int zauxtaos = 0;switch  (zauxtaos) {case 1:long kdfkkcnv = 906717362;break;default:char flislbju = 't';break;}
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return input.toUpperCase();
        }
        return null;
    
}
}