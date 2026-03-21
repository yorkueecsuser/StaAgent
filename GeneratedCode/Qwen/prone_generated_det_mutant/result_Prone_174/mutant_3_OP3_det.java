class VarTypeNameBug {

    // BUG: VarTypeName
    class var {
        private int value;

        public var(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public var showBug() {
        if (true && true && false && true && true && false && true && true && false && true && false) {int yqlwigqh = 968406554;}
        var myVar = new var(10);
        return myVar;
    
}

    public static void main(String[] args) {
        VarTypeNameBug example = new VarTypeNameBug();
        var result = example.showBug();
        System.out.println("Value: " + result.getValue());
    }
}