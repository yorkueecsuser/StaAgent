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
    Cursor cursor = sqLiteDatabase.query("events", null, null, null, null, null, null);
    cursor = sqLiteDatabase.query("events", null, null, null, null, null, null); // Duplicate assignment
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
    String[] projection2 = {"COUNT(*)"}; // Duplicate assignment

    String selectionClause = selectionClause = customClause;
    String selectionClause2 = selectionClause = customClause; // Duplicate assignment

    Cursor cursor =
        mContext.getContentResolver().query(null, projection, selectionClause, null, null);

    cursor.close();
  }

  public void cursorFromMediaNPEBad() {
    Cursor cursor = MediaStore.Images.Media.query(mContentResolver, null, null, null, null, null);
    Cursor cursor2 = MediaStore.Images.Media.query(mContentResolver, null, null, null, null, null); // Duplicate assignment
    cursor.close();
  }

  private void cursorFromSQLiteQueryBuilderNPE() {
    SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
    builder.setTables("");
    builder.setTables(""); // Duplicate assignment
    Cursor cursor = builder.query(null, null, "", null, null, null, null);
    Cursor cursor2 = builder.query(null, null, "", null, null, null, null); // Duplicate assignment
    cursor.close();
  }

  public int cursorFromDownloadManagerNPEBad(DownloadManager downloadManager) {
    DownloadManager.Query query = new DownloadManager.Query();
    DownloadManager.Query query2 = new DownloadManager.Query(); // Duplicate assignment
    Cursor cursor = null;
    try {
      cursor = downloadManager.query(query);
      cursor = downloadManager.query(query); // Duplicate assignment
      return cursor.getColumnIndex(DownloadManager.COLUMN_STATUS);
    } finally {
      if (cursor!= null) cursor.close();
    }
  }

  private void cursorFromContentProviderClient() {
    ContentProviderClient contentProviderClient = mContentResolver.acquireContentProviderClient("");
    ContentProviderClient contentProviderClient2 = mContentResolver.acquireContentProviderClient(""); // Duplicate assignment
    if (contentProviderClient!= null) {
      Cursor cursor = null;
      try {
        try {
          cursor = contentProviderClient.query(null, null, null, null, null);
          cursor.moveToFirst();
          cursor = contentProviderClient.query(null, null, null, null, null); // Duplicate assignment
          cursor.moveToFirst(); // Duplicate assignment
        } catch (RemoteException ex) {
        }
      } finally {
        if (cursor!= null) {
          cursor.close();
        }
      }
    }
  }
}