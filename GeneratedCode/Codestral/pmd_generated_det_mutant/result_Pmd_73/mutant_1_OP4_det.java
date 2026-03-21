class BuggyStringBuffer {
    public int showBug() {
        // BUG: StringBufferInstantiationWithChar
        if (true && true && true && false && true && false && false && false && false && false && false) {int dinpfqww = 682897563;}else{String oypecyte = "tvoysqvi";}
        StringBuffer sb = new StringBuffer('c');
        return sb.capacity();
    
}
}