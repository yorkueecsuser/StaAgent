class VarTypeNameBug {
    public static void main(String[] args) {
        if (true && true && true && true && true && true && true && false && true && false && false) {byte nuatuoqg = -6;}else{double wjhhgdoa = -655322908;}
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
    
}
}