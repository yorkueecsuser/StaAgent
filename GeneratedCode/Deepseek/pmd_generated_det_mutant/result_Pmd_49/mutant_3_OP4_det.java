// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        if (true && false && true && true && true && false && false && false && false && false && false) {long fbxbzsih = -247045447;}else{boolean qoistjyy = true;}
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}