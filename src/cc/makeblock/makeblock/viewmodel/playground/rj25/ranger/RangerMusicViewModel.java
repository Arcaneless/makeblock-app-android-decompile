package cc.makeblock.makeblock.viewmodel.playground.rj25.ranger;

import cc.makeblock.makeblock.engine.action.Action;
import cc.makeblock.makeblock.engine.action.ActionBuilder;
import cc.makeblock.makeblock.engine.device.Ranger;
import cc.makeblock.makeblock.engine.device.operation.Buzzer;
import cc.makeblock.makeblock.engine.protocol.rj25.BuzzerTone;
import cc.makeblock.makeblock.engine.protocol.rj25.sing.ChristmasFactory;
import cc.makeblock.makeblock.engine.protocol.rj25.sing.HappyBirthdayFactory;
import cc.makeblock.makeblock.engine.protocol.rj25.sing.LittleStarsFactory;
import cc.makeblock.makeblock.engine.protocol.rj25.sing.TwoTigersFactory;
import cc.makeblock.makeblock.engine.statistics.StatisticsTool;

public class RangerMusicViewModel
  extends RangerViewModel
{
  private Action mChristmasAction;
  private Action mHappyBirthdayAction;
  private Action mLittleStarsAction;
  private Action mTwoTigersAction;
  
  public RangerMusicViewModel(Ranger paramRanger)
  {
    super(paramRanger);
  }
  
  public void clickMusicKey(int paramInt)
  {
    cancelAction(2);
    BuzzerTone localBuzzerTone;
    switch (paramInt)
    {
    default: 
      localBuzzerTone = null;
    }
    for (;;)
    {
      if (localBuzzerTone != null) {
        ((Ranger)this.device).playTune(localBuzzerTone);
      }
      return;
      localBuzzerTone = BuzzerTone.C5;
      continue;
      localBuzzerTone = BuzzerTone.D5;
      continue;
      localBuzzerTone = BuzzerTone.E5;
      continue;
      localBuzzerTone = BuzzerTone.F5;
      continue;
      localBuzzerTone = BuzzerTone.G5;
      continue;
      localBuzzerTone = BuzzerTone.A5;
      continue;
      localBuzzerTone = BuzzerTone.B5;
      continue;
      localBuzzerTone = BuzzerTone.L1;
      continue;
      localBuzzerTone = BuzzerTone.L2;
      continue;
      localBuzzerTone = BuzzerTone.L3;
      continue;
      localBuzzerTone = BuzzerTone.L4;
      continue;
      localBuzzerTone = BuzzerTone.L5;
    }
  }
  
  public void playChristmas()
  {
    if (this.mChristmasAction == null) {
      this.mChristmasAction = new ChristmasFactory((Buzzer)this.device).createActionBuilder().build();
    }
    if (executeAction(this.mChristmasAction))
    {
      StatisticsTool.getInstance().onEvent("mBot RangerPlayJungleBell", "mBot Ranger播放圣诞歌");
      return;
    }
    cancelAction(this.mChristmasAction);
  }
  
  public void playHappyBirthday()
  {
    if (this.mHappyBirthdayAction == null) {
      this.mHappyBirthdayAction = new HappyBirthdayFactory((Buzzer)this.device).createActionBuilder().build();
    }
    if (executeAction(this.mHappyBirthdayAction))
    {
      StatisticsTool.getInstance().onEvent("mBot RangerPlayHappyBirthday", "mBot Ranger播放生日歌");
      return;
    }
    cancelAction(this.mHappyBirthdayAction);
  }
  
  public void playLittleStars()
  {
    if (this.mLittleStarsAction == null) {
      this.mLittleStarsAction = new LittleStarsFactory((Buzzer)this.device).createActionBuilder().build();
    }
    if (executeAction(this.mLittleStarsAction))
    {
      StatisticsTool.getInstance().onEvent("mBot RangerPlayLittleStars", "mBot Ranger播放小星星");
      return;
    }
    cancelAction(this.mLittleStarsAction);
  }
  
  public void playTwoTigers()
  {
    if (this.mTwoTigersAction == null) {
      this.mTwoTigersAction = new TwoTigersFactory((Buzzer)this.device).createActionBuilder().build();
    }
    if (executeAction(this.mTwoTigersAction))
    {
      StatisticsTool.getInstance().onEvent("mBot RangerPlayTwoTigers", "mBot Ranger播放两只老虎");
      return;
    }
    cancelAction(this.mTwoTigersAction);
  }
}


/* Location:              C:\Users\Marcus Cheung\Desktop\AndriodHacking\Makeblock_v3.0.8_apkpure.com-dex2jar.jar!\cc\makeblock\makeblock\viewmodel\playground\rj25\ranger\RangerMusicViewModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */