package retrofit2;

public abstract interface Callback<T>
{
  public abstract void onFailure(Call<T> paramCall, Throwable paramThrowable);
  
  public abstract void onResponse(Call<T> paramCall, Response<T> paramResponse);
}


/* Location:              C:\Users\Marcus Cheung\Desktop\AndriodHacking\Makeblock_v3.0.8_apkpure.com-dex2jar.jar!\retrofit2\Callback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */