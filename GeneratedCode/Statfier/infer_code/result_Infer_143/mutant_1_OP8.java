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
    try {
      return cursor.getCount();
    } finally {
      cursor.close();
    }
  }

  // Mutant: Renamed mContext to a
  Context a;
  ContentResolver mContentResolver;

  public void cursorFromContentResolverNPEBad(String customClause) {
    String[] projection = {"COUNT(*)"};

    String selectionClause = selectionClause = customClause;

    // Mutant: Renamed cursor to b
    Cursor b =
        a.getContentResolver().query(null, projection, selectionClause, null, null);

    b.close();
  }

  public void cursorFromMediaNPEBad() {
    // Mutant: Renamed cursor to c
    Cursor c = MediaStore.Images.Media.query(mContentResolver, null, null, null, null, null);
    c.close();
  }

  private void cursorFromSQLiteQueryBuilderNPE() {
    SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
    builder.setTables("");
    // Mutant: Renamed cursor to d
    Cursor d = builder.query(null, null, "", null, null, null, null);
    d.close();
  }

  public int cursorFromDownloadManagerNPEBad(DownloadManager downloadManager) {
    DownloadManager.Query query = new DownloadManager.Query();
    // Mutant: Renamed cursor to e
    Cursor e = null;
    try {
      e = downloadManager.query(query);
      return e.getColumnIndex(DownloadManager.COLUMN_STATUS);
    } finally {
      if (e!= null) e.close();
    }
  }

  private void cursorFromContentProviderClient() {
    // Mutant: Renamed contentProviderClient to f
    ContentProviderClient f = mContentResolver.acquireContentProviderClient("");
    if (f!= null) {
      // Mutant: Renamed cursor to g
      Cursor g = null;
      try {
        try {
          g = f.query(null, null, null, null, null);
          g.moveToFirst();
        } catch (RemoteException ex) {
        }
      } finally {
        if (g!= null) {
          g.close();
        }
      }
    }
  }
}