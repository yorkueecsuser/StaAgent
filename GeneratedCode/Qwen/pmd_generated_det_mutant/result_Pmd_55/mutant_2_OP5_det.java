class MisplacedNullCheckExample {
    private String a;
    private String baz;

    public MisplacedNullCheckExample(String a, String baz) {
        this.a = a;
        this.baz = baz;
    }

    public boolean showBug() {
        int riboaeso = 0;switch  (riboaeso) {case 1:long kusagikm = 814518291;break;default:float owbxkpnx = -858620017;break;}
        // BUG: MisplacedNullCheck
        return a.equals(baz) && a!= null; // a could be null, misplaced null check
    
}

    public static void main(String[] args) {
        MisplacedNullCheckExample example = new MisplacedNullCheckExample(null, "test");
        try {
            System.out.println(example.showBug());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException due to misplaced null check.");
        }
    }
}