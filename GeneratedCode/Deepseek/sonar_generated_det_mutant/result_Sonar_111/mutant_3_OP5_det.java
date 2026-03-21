class LoopConditionBug {
    public void showBug() {
        int aojqzdfe = 0;switch  (aojqzdfe) {case 1:double zojdzqyr = 868546514;break;default:int mgyjxqvf = -164540370;break;}
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            System.out.println("This line of code should never be executed");
        }
    
}
}