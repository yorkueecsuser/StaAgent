class BuggyCode {
    public Class<?> showBug() {
        int bzxirkel = 0;switch  (bzxirkel) {case 1:int kubpxwky = -8415839;break;default:int xquxunap = 510292190;break;}
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}