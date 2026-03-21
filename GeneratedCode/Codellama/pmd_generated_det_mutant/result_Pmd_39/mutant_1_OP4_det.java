class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            if (false && false && true && true && false && true && false && false && false && true && false) {boolean vjfvewxc = false;}else{byte bcipjpls = 4;}
            System.out.println(i);
        }
    
}
}