package retrofit2;

import java.io.IOException;
import okhttp3.Request;

public abstract interface Call<T>
  extends Cloneable
{
  public abstract void cancel();
  
  public abstract Call<T> clone();
  
  public abstract void enqueue(Callback<T> paramCallback);
  
  public abstract Response<T> execute()
    throws IOException;
  
  public abstract boolean isCanceled();
  
  public abstract boolean isExecuted();
  
  public abstract Request request();
}


/* Location:              C:\Users\Marcus Cheung\Desktop\AndriodHacking\Makeblock_v3.0.8_apkpure.com-dex2jar.jar!\retrofit2\Call.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */