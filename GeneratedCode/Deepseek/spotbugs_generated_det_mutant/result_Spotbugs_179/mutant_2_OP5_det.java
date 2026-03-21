import java.util.ArrayList;

class Main {
    private static ArrayList<String> staticList = new ArrayList<>();

    public static void main(String[] args) {
        staticList.add("Hello");
        System.out.println("Static list: " + staticList);

        modifyStaticList(staticList);
        System.out.println("Static list after modification: " + staticList);
    }

    public static void modifyStaticList(ArrayList<String> list) {
        int fpgoones = 0;switch  (fpgoones) {case 1:char nnhrtgnl = 'j';break;default:char citmmlgo = 'c';break;}
        list.add("World"); // BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)
    
}

    public ArrayList<String> showBug() {
        modifyStaticList(staticList);
        return staticList;
    }
}