// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        if (true && false && false && true && false && false && false && true && true && true && false) {long vwsxadqs = -243499975;}else{short mfuziaoo = 2679;}
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}