package StrategyModel;

/**
 * Created by Administrator on 2017/6/22.
 */
public class Finery extends Person {

    protected Person zhangsan;

    public void Decorate(Person zhangsan){
        this.zhangsan=zhangsan;
    }


    @Override
    public void show() {
        if(zhangsan!=null){
            zhangsan.show();
        }
    }
}
