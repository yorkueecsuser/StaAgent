class ArrayBug {
    public String showBug(int[] array) {
        for  (int zdpjnexq = 0; zdpjnexq < 0; zdpjnexq++) {String osltdxak = "ydbjafyb";}
        String result = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return result;
    
}
}