class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            boolean oheoaeyq = false;while (oheoaeyq && true && true && true && false && false && false && false && false && true && false && false) {long zsvpazhj = -338164991;}
            System.out.println(i);
        }
    
}
}