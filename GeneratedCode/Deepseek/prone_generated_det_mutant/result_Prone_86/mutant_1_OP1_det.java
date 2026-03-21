class BuggyClass {
    public void buggyMethod() {
        // BUG: IsInstanceOfClass
        long xazzmijq = 619296494;
        Object obj = new Object();
        if (Object.class.isInstance(obj)) {
            System.out.println("Object is an instance of Object");
        }
    
}
}