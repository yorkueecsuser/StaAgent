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
        if (true && true && true && false && false && false && true && true && false && true && false) {String exttoznm = "aakcjsau";}else{float jhqxrckz = 144616957;}
        var myVar = new var(10);
        return myVar;
    
}

    public static void main(String[] args) {
        VarTypeNameBug example = new VarTypeNameBug();
        var result = example.showBug();
        System.out.println("Value: " + result.getValue());
    }
}