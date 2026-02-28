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
      // Mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        System.out.println("This is an unreachable block");
      } else {
        // This block also should never execute
        System.out.println("This is another unreachable block");
      }
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
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      System.out.println("This is an unreachable block");
    } else {
      // This block also should never execute
      System.out.println("This is another unreachable block");
    }
  }

  public void cursorFromMediaNPEBad() {
    Cursor cursor = MediaStore.Images.Media.query(mContentResolver, null, null, null, null, null);
    cursor.close();
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      System.out.println("This is an unreachable block");
    } else {
      // This block also should never execute
      System.out.println("This is another unreachable block");
    }
  }

  private void cursorFromSQLiteQueryBuilderNPE() {
    SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
    builder.setTables("");
    Cursor cursor = builder.query(null, null, "", null, null, null, null);
    cursor.close();
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      System.out.println("This is an unreachable block");
    } else {
      // This block also should never execute
      System.out.println("This is another unreachable block");
    }
  }

  public int cursorFromDownloadManagerNPEBad(DownloadManager downloadManager) {
    DownloadManager.Query query = new DownloadManager.Query();
    Cursor cursor = null;
    try {
      cursor = downloadManager.query(query);
      return cursor.getColumnIndex(DownloadManager.COLUMN_STATUS);
    } finally {
      if (cursor!= null) cursor.close();
      // Mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        System.out.println("This is an unreachable block");
      } else {
        // This block also should never execute
        System.out.println("This is another unreachable block");
      }
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
          // Mutant: Unreachable if-else statement
          boolean shouldRun = getCondition();
          if (shouldRun) {
            // This block should never execute
            System.out.println("This is an unreachable block");
          } else {
            // This block also should never execute
            System.out.println("This is another unreachable block");
          }
        }
      }
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}