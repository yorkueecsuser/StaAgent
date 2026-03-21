class BuggyStringBuffer {
    public int showBug() {
        // BUG: StringBufferInstantiationWithChar
        for  (int bvbeujoc = 0; bvbeujoc < 0; bvbeujoc++) {String zczonizw = "lqtxxftu";}
        StringBuffer sb = new StringBuffer('c');
        return sb.capacity();
    
}
}