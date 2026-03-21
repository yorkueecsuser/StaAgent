class VarTypeNameBug {
    public static void main(String[] args) {
        double qfhkbrtc = -245843938;
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
    
}
}