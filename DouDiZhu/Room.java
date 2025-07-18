package DouDiZhu;

import java.util.*;

public class Room {
    //1.准备好54张牌，给房间使用，定义一个集合容器装54张牌。
    private List<Card> allCard =new ArrayList<>();
    //2.初始化54张牌进去
    {
        //3.准备点数
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //4.准备花色
        String[] colors = {"黑桃", "红桃", "梅花", "方片"};
        //5.组合点数和花色成为牌对象，加入到集合中去。
        int num=0; //牌的大小
        for(String size:sizes)
        {
            num++;
            for (String color:colors){
                //6.创建牌对象
                Card card=new Card(size,color,num);
                //7.加入到集合中
                allCard.add(card);
            }
        }

        allCard.add(new Card("小王", "🃏",++num));
        allCard.add(new Card("大王", "👲",++num));
        System.out.println("新牌是:"+ allCard);
    }
    public void start(){
        //8.洗牌：随机打乱集合中的顺序
        Collections.shuffle(allCard);
        System.out.println("洗牌后是:"+ allCard);


        //9.发牌：定义三个玩家：
        Map<String,List<Card>> players=new HashMap<>();
        List<Card> lhc=new ArrayList<>(); //李华成
        players.put("李华成",lhc);

        List<Card> lzj=new ArrayList<>(); //李志杰
        players.put("李志杰",lzj);

        List<Card> lhz=new ArrayList<>(); //李华珍
        players.put("李华珍",lhz);

        for(int i=0;i<allCard.size()-3;i++)
        {
            Card card=allCard.get(i);

            if(i%3==0)
            {
                lhc.add(card); //李华成
            } else if (i%3==1) {
                lzj.add(card); //李志杰
            } else {
                lhz.add(card); //李华珍
            }
        }

        //10.对牌排序

       sortCards(lhc);
         sortCards(lzj);
        sortCards(lhz);


        //12.对三张底牌进行处理
        List<Card> lastCards=allCard.subList(allCard.size()-3, allCard.size());
        System.out.println("底牌是:"+lastCards);

        //抢地主：把这个集合直接倒给玩家
        lhz.addAll(lastCards);


        //11.看牌
        for(Map.Entry<String,List<Card>> entry:players.entrySet())
        {
            String name=entry.getKey();
            List<Card> cards=entry.getValue();
            System.out.println(name+"的牌是:"+cards);
        }
    }

    private void sortCards(List<Card> cards){
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getNum()- o1.getNum();
            }
        });
    }
}
