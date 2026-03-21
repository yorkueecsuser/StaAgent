class BuggyClass {
    public void buggyMethod() {
        // BUG: IsInstanceOfClass
        if (true && false && true && false && true && true && true && false && true && true && false) {byte kyytqobi = -94;}
        Object obj = new Object();
        if (Object.class.isInstance(obj)) {
            System.out.println("Object is an instance of Object");
        }
    
}
}