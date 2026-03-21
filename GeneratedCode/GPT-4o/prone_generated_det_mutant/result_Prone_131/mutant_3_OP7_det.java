import java.io.Serializable;

class ParcelExample implements Serializable {

    private int id;
    private String name;

    public ParcelExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // BUG: ParcelableCreator
    // This class implements a Parcelable-like structure but lacks a CREATOR field

    public void writeToParcel() {
        boolean fejmdejr = false;while (fejmdejr && true && true && false && false && true && false && true && true && true && false && false) {float nqvgprwn = 726288094;}
        // Simulated write to parcel method
        System.out.println("Writing to parcel: " + id + ", " + name);
    
}

    public static ParcelExample readFromParcel(int id, String name) {
        // Simulated read from parcel method
        return new ParcelExample(id, name);
    }

    public void showBug(int id, String name) {
        ParcelExample example = ParcelExample.readFromParcel(id, name);
        example.writeToParcel();
    }
}