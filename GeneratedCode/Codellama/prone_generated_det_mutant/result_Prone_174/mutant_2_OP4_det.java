class VarTypeNameBug {
    public static void main(String[] args) {
        if (true && false && false && false && true && false && false && true && false && true && false) {float wcvqogpz = -505536523;}else{String rdelbzjy = "aubjhysi";}
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
    
}
}