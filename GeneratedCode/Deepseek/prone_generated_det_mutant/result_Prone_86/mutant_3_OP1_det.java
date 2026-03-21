class BuggyClass {
    public void buggyMethod() {
        // BUG: IsInstanceOfClass
        char npdhvksu = 'z';
        Object obj = new Object();
        if (Object.class.isInstance(obj)) {
            System.out.println("Object is an instance of Object");
        }
    
}
}