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
        if (false && true && true && true && false && false && true && false && true && false && false) {char veijwxba = 'u';}
        var myVar = new var(10);
        return myVar;
    
}

    public static void main(String[] args) {
        VarTypeNameBug example = new VarTypeNameBug();
        var result = example.showBug();
        System.out.println("Value: " + result.getValue());
    }
}