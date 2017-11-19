package com.iflytek.speech;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public abstract interface WakeuperListener
  extends IInterface
{
  public abstract void onBeginOfSpeech()
    throws RemoteException;
  
  public abstract void onEndOfSpeech()
    throws RemoteException;
  
  public abstract void onError(int paramInt)
    throws RemoteException;
  
  public abstract void onResult(WakeuperResult paramWakeuperResult)
    throws RemoteException;
  
  public abstract void onVolumeChanged(int paramInt)
    throws RemoteException;
  
  public static abstract class Stub
    extends Binder
    implements WakeuperListener
  {
    private static final String DESCRIPTOR = "com.iflytek.speech.WakeuperListener";
    static final int TRANSACTION_onBeginOfSpeech = 2;
    static final int TRANSACTION_onEndOfSpeech = 3;
    static final int TRANSACTION_onError = 5;
    static final int TRANSACTION_onResult = 4;
    static final int TRANSACTION_onVolumeChanged = 1;
    
    public Stub()
    {
      attachInterface(this, "com.iflytek.speech.WakeuperListener");
    }
    
    public static WakeuperListener asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.iflytek.speech.WakeuperListener");
      if ((localIInterface != null) && ((localIInterface instanceof WakeuperListener))) {
        return (WakeuperListener)localIInterface;
      }
      return new Proxy(paramIBinder);
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.iflytek.speech.WakeuperListener");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.iflytek.speech.WakeuperListener");
        onVolumeChanged(paramParcel1.readInt());
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.iflytek.speech.WakeuperListener");
        onBeginOfSpeech();
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.iflytek.speech.WakeuperListener");
        onEndOfSpeech();
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.iflytek.speech.WakeuperListener");
        if (paramParcel1.readInt() != 0) {}
        for (paramParcel1 = (WakeuperResult)WakeuperResult.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
        {
          onResult(paramParcel1);
          return true;
        }
      }
      paramParcel1.enforceInterface("com.iflytek.speech.WakeuperListener");
      onError(paramParcel1.readInt());
      return true;
    }
    
    private static class Proxy
      implements WakeuperListener
    {
      private IBinder mRemote;
      
      Proxy(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }
      
      public IBinder asBinder()
      {
        return this.mRemote;
      }
      
      public String getInterfaceDescriptor()
      {
        return "com.iflytek.speech.WakeuperListener";
      }
      
      public void onBeginOfSpeech()
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.iflytek.speech.WakeuperListener");
          this.mRemote.transact(2, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public void onEndOfSpeech()
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.iflytek.speech.WakeuperListener");
          this.mRemote.transact(3, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public void onError(int paramInt)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.iflytek.speech.WakeuperListener");
          localParcel.writeInt(paramInt);
          this.mRemote.transact(5, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      /* Error */
      public void onResult(WakeuperResult paramWakeuperResult)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 35	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: aload_2
        //   5: ldc 26
        //   7: invokevirtual 39	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   10: aload_1
        //   11: ifnull +33 -> 44
        //   14: aload_2
        //   15: iconst_1
        //   16: invokevirtual 55	android/os/Parcel:writeInt	(I)V
        //   19: aload_1
        //   20: aload_2
        //   21: iconst_0
        //   22: invokevirtual 63	com/iflytek/speech/WakeuperResult:writeToParcel	(Landroid/os/Parcel;I)V
        //   25: aload_0
        //   26: getfield 19	com/iflytek/speech/WakeuperListener$Stub$Proxy:mRemote	Landroid/os/IBinder;
        //   29: iconst_4
        //   30: aload_2
        //   31: aconst_null
        //   32: iconst_1
        //   33: invokeinterface 45 5 0
        //   38: pop
        //   39: aload_2
        //   40: invokevirtual 48	android/os/Parcel:recycle	()V
        //   43: return
        //   44: aload_2
        //   45: iconst_0
        //   46: invokevirtual 55	android/os/Parcel:writeInt	(I)V
        //   49: goto -24 -> 25
        //   52: astore_1
        //   53: aload_2
        //   54: invokevirtual 48	android/os/Parcel:recycle	()V
        //   57: aload_1
        //   58: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	59	0	this	Proxy
        //   0	59	1	paramWakeuperResult	WakeuperResult
        //   3	51	2	localParcel	Parcel
        // Exception table:
        //   from	to	target	type
        //   4	10	52	finally
        //   14	25	52	finally
        //   25	39	52	finally
        //   44	49	52	finally
      }
      
      public void onVolumeChanged(int paramInt)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.iflytek.speech.WakeuperListener");
          localParcel.writeInt(paramInt);
          this.mRemote.transact(1, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
    }
  }
}


/* Location:              C:\Users\Marcus Cheung\Desktop\AndriodHacking\Makeblock_v3.0.8_apkpure.com-dex2jar.jar!\com\iflytek\speech\WakeuperListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */