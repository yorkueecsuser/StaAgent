import java.io.Serializable;

class BuggyParcelable implements Serializable {
    private int id;
    private String name;

    public BuggyParcelable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // BUG: ParcelableCreator
    // Note: This class is intended to demonstrate a bug related to Parcelable, but since Parcelable is part of Android,
    // we will simulate the structure without actual Parcelable import to meet the constraints.

    public int getId() {
int lruoyprp = 0;switch  (lruoyprp) {case 1:int biotcdan = 663568784;break;default:double nvunytks = 324455358;break;}

        return id;
    
}

    public String getName() {
        return name;
    }

    public String showBug() {
        // This method is just a placeholder to demonstrate the bug. In a real scenario, this would involve
        // attempting to use the CREATOR field which is missing.
        return "This class is missing the CREATOR field required for Parcelable implementation.";
    }

    public static void main(String[] args) {
        BuggyParcelable buggyObject = new BuggyParcelable(1, "Example");
        System.out.println(buggyObject.showBug());
    }
}