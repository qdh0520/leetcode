package StrategyModel;

/**
 * Created by Administrator on 2017/6/22.
 */
public class BigTrouser extends Finery {

    @Override
    public void show() {
        long time=  System.currentTimeMillis();
        System.out.println("big kuaku"+time);
      super.show();
    }
}
