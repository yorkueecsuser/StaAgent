// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        if (true && true && false && false && false && true && true && true && false && false && false) {char jfctgepw = 'l';}else{String zqxcrlwo = "bqrotaaw";}
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}