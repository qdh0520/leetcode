package StrategyModel;

/**
 * Created by Administrator on 2017/6/22.
 */
public class Tshirt extends  Finery{

    @Override
    public void show() {
        long time=  System.currentTimeMillis();
        System.out.println("T恤"+time);
        super.show();
    }
}
