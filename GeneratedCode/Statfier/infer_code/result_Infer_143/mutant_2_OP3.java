import android.app.DownloadManager;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.os.RemoteException;
import android.provider.MediaStore;

class CursorNPEs {

  public int cursorNPEfromQuery(SQLiteDatabase sqLiteDatabase) {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    Cursor cursor = sqLiteDatabase.query("events", null, null, null, null, null, null);
    try {
      return cursor.getCount();
    } finally {
      cursor.close();
    }
  }

  Context mContext;
  ContentResolver mContentResolver;

  public void cursorFromContentResolverNPEBad(String customClause) {
    String[] projection = {"COUNT(*)"};

    String selectionClause = selectionClause = customClause;

    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }

    Cursor cursor =
        mContext.getContentResolver().query(null, projection, selectionClause, null, null);

    cursor.close();
  }

  public void cursorFromMediaNPEBad() {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }

    Cursor cursor = MediaStore.Images.Media.query(mContentResolver, null, null, null, null, null);
    cursor.close();
  }

  private void cursorFromSQLiteQueryBuilderNPE() {
    SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
    builder.setTables("");
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }

    Cursor cursor = builder.query(null, null, "", null, null, null, null);
    cursor.close();
  }

  public int cursorFromDownloadManagerNPEBad(DownloadManager downloadManager) {
    DownloadManager.Query query = new DownloadManager.Query();
    Cursor cursor = null;
    try {
      cursor = downloadManager.query(query);
      return cursor.getColumnIndex(DownloadManager.COLUMN_STATUS);
    } finally {
      if (cursor!= null) cursor.close();
    }
  }

  private void cursorFromContentProviderClient() {
    ContentProviderClient contentProviderClient = mContentResolver.acquireContentProviderClient("");
    if (contentProviderClient!= null) {
      Cursor cursor = null;
      try {
        try {
          cursor = contentProviderClient.query(null, null, null, null, null);
          cursor.moveToFirst();
        } catch (RemoteException ex) {
        }
      } finally {
        if (cursor!= null) {
          cursor.close();
        }
      }
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, but it's not a compile-time constant in this context
  }
}