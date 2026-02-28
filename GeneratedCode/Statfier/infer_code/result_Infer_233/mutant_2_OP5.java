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

  private boolean getCondition() {
    return false;
  }

  @Override
  public int bulkInsert(Uri uri, ContentValues[] values) {
    mFile = new File(uri.toString());
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case is unreachable because getCondition() always returns false
        mFile = new File("unreachable");
        break;
    }
    return 0;
  }

  @Override
  public Bundle call(String method, String args, Bundle extras) {
    mFile = new File(method);
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case is unreachable because getCondition() always returns false
        mFile = new File("unreachable");
        break;
    }
    return extras;
  }

  @Override
  public int delete(Uri uri, String selection, String[] selectionArgs) {
    mFile = new File(uri.toString());
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case is unreachable because getCondition() always returns false
        mFile = new File("unreachable");
        break;
    }
    return 0;
  }

  @Override
  public Uri insert(Uri uri, ContentValues values) {
    mFile = new File(uri.toString());
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case is unreachable because getCondition() always returns false
        mFile = new File("unreachable");
        break;
    }
    return null;
  }

  @Override
  public String getType(Uri uri) {
    mFile = new File(uri.toString());
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case is unreachable because getCondition() always returns false
        mFile = new File("unreachable");
        break;
    }
    return null;
  }

  @Override
  public AssetFileDescriptor openAssetFile(Uri uri, String mode, CancellationSignal signal) {
    mFile = new File(uri.toString());
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case is unreachable because getCondition() always returns false
        mFile = new File("unreachable");
        break;
    }
    return null;
  }

  @Override
  public ParcelFileDescriptor openFile(Uri uri, String mode, CancellationSignal signal) {
    mFile = new File(uri.toString());
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case is unreachable because getCondition() always returns false
        mFile = new File("unreachable");
        break;
    }
    return null;
  }

  @Override
  public AssetFileDescriptor openTypedAssetFile(
      Uri uri, String mimeTypeFilter, Bundle opts, CancellationSignal signal) {
    mFile = new File(uri.toString());
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case is unreachable because getCondition() always returns false
        mFile = new File("unreachable");
        break;
    }
    return null;
  }

  @Override
  public Cursor query(
      Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
    mFile = new File(uri.toString());
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case is unreachable because getCondition() always returns false
        mFile = new File("unreachable");
        break;
    }
    return null;
  }

  @Override
  public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
    mFile = new File(uri.toString());
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case is unreachable because getCondition() always returns false
        mFile = new File("unreachable");
        break;
    }
    return 0;
  }
}