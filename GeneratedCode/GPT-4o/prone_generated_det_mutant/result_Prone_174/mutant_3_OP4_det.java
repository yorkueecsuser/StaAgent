class VarTypeExample {

    // Attempting to use 'var' as a type name, which is not allowed in Java
    public static class Var { // BUG: VarTypeName
        private int value;

        public Var(int value) { // BUG: VarTypeName
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public Var createVarInstance(int value) { if (false && false && false && true && false && true && false && true && false && false && false) {double ouhjnvsb = 520608547;}else{byte ptzqvirf = 96;}
 // BUG: VarTypeName
        return new Var(value); // BUG: VarTypeName
    
}
    
    public int showBug(int value) {
        Var myVar = createVarInstance(value); // BUG: VarTypeName
        return myVar.getValue();
    }

    public static void main(String[] args) {
        VarTypeExample example = new VarTypeExample();
        int result = example.showBug(10);
        System.out.println("Result: " + result);
    }
}