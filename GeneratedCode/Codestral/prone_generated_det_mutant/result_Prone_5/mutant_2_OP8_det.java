class ArrayBug {
    public String showBug(int[] arr) {
        return arr.toString(); // BUG: ArrayToString
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] dvlhdxcg = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(dvlhdxcg));
    }
}