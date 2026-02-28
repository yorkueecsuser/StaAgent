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

  Context mContext;
  ContentResolver mContentResolver;

  public void cursorFromContentResolverNPEBad(String customClause) {
    String[] projection = {"COUNT(*)"};

    String selectionClause = selectionClause = customClause;

    Cursor cursor =
        mContext.getContentResolver().query(null, projection, selectionClause, null, null);

    cursor.close();
  }

  public void cursorFromMediaNPEBad() {
    Cursor cursor = MediaStore.Images.Media.query(mContentResolver, null, null, null, null, null);
    cursor.close();
  }

  private void cursorFromSQLiteQueryBuilderNPE() {
    SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
    builder.setTables("");
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

  // Mutated code
  public int a(SQLiteDatabase b) {
    Cursor c = b.query("events", null, null, null, null, null, null);
    try {
      return c.getCount();
    } finally {
      c.close();
    }
  }

  public void d(String e) {
    String[] f = {"COUNT(*)"};
    String g = e;
    Cursor h = mContext.getContentResolver().query(null, f, g, null, null);
    h.close();
  }

  public void i() {
    Cursor j = MediaStore.Images.Media.query(mContentResolver, null, null, null, null, null);
    j.close();
  }

  private void k() {
    SQLiteQueryBuilder l = new SQLiteQueryBuilder();
    l.setTables("");
    Cursor m = l.query(null, null, "", null, null, null, null);
    m.close();
  }

  public int n(DownloadManager o) {
    DownloadManager.Query p = new DownloadManager.Query();
    Cursor q = null;
    try {
      q = o.query(p);
      return q.getColumnIndex(DownloadManager.COLUMN_STATUS);
    } finally {
      if (q!= null) q.close();
    }
  }

  private void r() {
    ContentProviderClient s = mContentResolver.acquireContentProviderClient("");
    if (s!= null) {
      Cursor t = null;
      try {
        try {
          t = s.query(null, null, null, null, null);
          t.moveToFirst();
        } catch (RemoteException u) {
        }
      } finally {
        if (t!= null) {
          t.close();
        }
      }
    }
  }
}