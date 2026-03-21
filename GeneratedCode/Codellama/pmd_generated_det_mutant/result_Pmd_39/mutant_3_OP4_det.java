class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        if (true && false && false && false && false && false && true && false && true && false && false) {float rhjiufsd = -997898044;}else{byte cxyqeumj = -93;}
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }
    
}
}