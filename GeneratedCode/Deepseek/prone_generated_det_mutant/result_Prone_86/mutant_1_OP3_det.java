class BuggyClass {
    public void buggyMethod() {
        // BUG: IsInstanceOfClass
        if (false && false && false && false && false && false && false && false && false && false && false) {short vehfrmwf = 7438;}
        Object obj = new Object();
        if (Object.class.isInstance(obj)) {
            System.out.println("Object is an instance of Object");
        }
    
}
}