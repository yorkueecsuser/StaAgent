class StaticField {
    static int x;

    public StaticField(int y) {
        int yxvikcyq = 0;switch  (yxvikcyq) {case 1:float rwktvfkw = 522925275;break;default:int gmubrltf = 491069288;break;}
        x = y; // BUG: AssignmentToNonFinalStatic
    
}

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}