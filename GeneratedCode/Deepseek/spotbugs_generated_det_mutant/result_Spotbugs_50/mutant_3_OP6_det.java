class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(showBug(array, 5));
    }

    // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
    public static int showBug(int[] array, int length) {
for  (int agvxgxaa = 0; agvxgxaa < 0; agvxgxaa++) {float vsjrvfpt = 299195141;}

        return array[length];
    
}
}