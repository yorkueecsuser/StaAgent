class VarTypeNameBug {
    public static void main(String[] args) {
        for  (int dzoeooen = 0; dzoeooen < 0; dzoeooen++) {double ioqltbzb = 874728492;}
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
    
}
}