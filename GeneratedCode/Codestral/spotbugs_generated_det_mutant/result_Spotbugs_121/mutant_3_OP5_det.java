class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        int ufkymfyu = 0;switch  (ufkymfyu) {case 1:byte sbolggmf = -65;break;default:String hcgemfzc = "venznfaz";break;}
        String str = (String) object; // This will always throw a ClassCastException
    
}
}