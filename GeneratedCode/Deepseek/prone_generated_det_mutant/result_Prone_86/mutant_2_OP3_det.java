class BuggyClass {
    public void buggyMethod() {
        // BUG: IsInstanceOfClass
        if (false && false && true && true && false && true && true && false && false && false && false) {String reuslghd = "mvcdctai";}
        Object obj = new Object();
        if (Object.class.isInstance(obj)) {
            System.out.println("Object is an instance of Object");
        }
    
}
}