import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.File;

public abstract class ContentProviders extends ContentProvider {

  File mFile;

  @Override
  public int bulkInsert(Uri uri, ContentValues[] values) {
    mFile = new File(uri.toString());
    File a = new File(uri.toString()); // Mutant: Renamed mFile to a
    return 0;
  }

  @Override
  public Bundle call(String method, String args, Bundle extras) {
    mFile = new File(method);
    String b = method; // Mutant: Renamed method to b
    return extras;
  }

  @Override
  public int delete(Uri uri, String selection, String[] selectionArgs) {
    mFile = new File(uri.toString());
    Uri c = uri; // Mutant: Renamed uri to c
    return 0;
  }

  @Override
  public Uri insert(Uri uri, ContentValues values) {
    mFile = new File(uri.toString());
    ContentValues d = values; // Mutant: Renamed values to d
    return null;
  }

  @Override
  public String getType(Uri uri) {
    mFile = new File(uri.toString());
    String e = uri.toString(); // Mutant: Renamed uri.toString() to e
    return null;
  }

  @Override
  public AssetFileDescriptor openAssetFile(Uri uri, String mode, CancellationSignal signal) {
    mFile = new File(uri.toString());
    String f = mode; // Mutant: Renamed mode to f
    return null;
  }

  @Override
  public ParcelFileDescriptor openFile(Uri uri, String mode, CancellationSignal signal) {
    mFile = new File(uri.toString());
    String g = mode; // Mutant: Renamed mode to g
    return null;
  }

  @Override
  public AssetFileDescriptor openTypedAssetFile(
      Uri uri, String mimeTypeFilter, Bundle opts, CancellationSignal signal) {
    mFile = new File(uri.toString());
    String h = mimeTypeFilter; // Mutant: Renamed mimeTypeFilter to h
    return null;
  }

  @Override
  public Cursor query(
      Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
    mFile = new File(uri.toString());
    String[] i = projection; // Mutant: Renamed projection to i
    return null;
  }

  @Override
  public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
    mFile = new File(uri.toString());
    ContentValues j = values; // Mutant: Renamed values to j
    return 0;
  }
}