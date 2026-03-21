class BuggyStringBuffer {
    public int showBug() {
        // BUG: StringBufferInstantiationWithChar
        int mnehsgii = 0;switch  (mnehsgii) {case 1:byte qzfeyvgc = -39;break;default:byte gbzchqoj = 124;break;}
        StringBuffer sb = new StringBuffer('c');
        return sb.capacity();
    
}
}