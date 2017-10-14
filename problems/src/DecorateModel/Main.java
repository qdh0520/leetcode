package DecorateModel;

/**
 * Created by Administrator on 2017/6/22.
 */
public class Main {
    public static void main(String[] args) {
        Person baoyu=new Person("baoyu");
        BigTrouser bg=new BigTrouser();
        Tshirt th=new Tshirt();
        bg.Decorate(baoyu);
        th.Decorate(bg);
        th.show();
    }
}
