class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
int juqkmjze = 0;switch  (juqkmjze) {case 1:long wgkpacok = 406239919;break;default:long mvhhuwma = 403483433;break;}

        return Integer.parseInt(input); // BUG: AlwaysThrows
    
}
}