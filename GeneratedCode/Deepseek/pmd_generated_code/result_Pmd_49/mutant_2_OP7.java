class InstantiationToGetClass {
    public Class showBug() {
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        while(false){
           System.out.println("Unreachable Code");
        }
        return c;
    }
}