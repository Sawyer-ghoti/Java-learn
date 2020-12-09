package Day6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 * 要求：斗地主案例，实现54张牌的洗牌、发牌、看牌，具体流程：三人轮流抽牌，最后三张作为底牌，随机玩家获得，最后展示（sout）所有人手上的牌
 */
public class Demo0PockerLandlord {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        poker = getPoker();
        Collections.shuffle(poker);
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> palm = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String card = poker.get(i);
            if(i>=51){
                palm.add(card);
            }
            else if(i%3==0){
                player1.add(card);
            }
            else if(i%3==1){
                player2.add(card);
            }
            else if(i%3==2){
                player3.add(card);
            }

        }
        System.out.println("palm:"+palm);
        Random random = new Random();
        int g = random.nextInt(2)+1;
        System.out.println(g);
        if(g==1){
            player1.addAll(palm);
        }
        if(g==2){
            player2.addAll(palm);
        }
        if(g==3){
            player3.addAll(palm);
        }

        System.out.println("Haley:"+player1);
        System.out.println("John:"+player2);
        System.out.println("Mac:"+player3);
    }
    public static ArrayList<String> getPoker(){
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♥", "♣", "♦", "♠"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        poker.add("Joker");
        poker.add("joker");
        for (String number : numbers) {
            for (String color : colors) {
                poker.add(color + number);
            }
        }
        System.out.println(poker);
        System.out.println(poker.size());
        return poker;
    }

}
