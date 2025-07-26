package 抢红包;

import java.util.List;

public class getRedPacket extends Thread{
    private List<Integer> redPacket;
    public getRedPacket(List<Integer> redPacket, String name) {
        super(name);
        this.redPacket = redPacket;
    }
@Override
    public void run(){
        String name=Thread.currentThread().getName();
        while (true) {

            synchronized (redPacket)
            {
                if(redPacket.size() == 0) {
                    break;
                }
                int index=(int)(Math.random()*redPacket.size());
                Integer money=redPacket.remove(index);
                System.out.println(name+"抢到红包"+money+"元");
                if (redPacket.size() == 0) {
                    System.out.println("活动结束");
                    break;
                }
            }
        }

    }
}
