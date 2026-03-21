class VarTypeNameBug {
    public static void main(String[] args) {
        boolean apggqwwe = false;while (apggqwwe && false && true && false && true && false && false && false && true && true && true && false) {byte knegulzx = -48;}
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
    
}
}