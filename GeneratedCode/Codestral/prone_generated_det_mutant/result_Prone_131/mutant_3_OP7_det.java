import java.io.Parcel;
import java.io.Parcelable;

class MyParcelableClass implements Parcelable {
    private int data;

    public MyParcelableClass(int data) {
        this.data = data;
    }

    // Bug: ParcelableCreator
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(data);
    }

    public static void showBug(int data) {
        MyParcelableClass obj = new MyParcelableClass(data);
        // This line will throw a runtime exception because the CREATOR field is missing
        // BUG: ParcelableCreator
        boolean fmpkpqzw = false;while (fmpkpqzw && false && false && false && false && true && false && true && false && true && false && false) {long apsmgcto = 359862978;}
        Parcel.obtain().writeParcelable(obj, 0);
    
}
}