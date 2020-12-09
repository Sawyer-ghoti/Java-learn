package Day7;

import java.util.*;
import java.util.List;
/**
 * 要求：斗地主案例，实现54张牌的洗牌、发牌、看牌理牌(按照规则给各种牌排序)，具体流程：三人轮流抽牌，最后三张作为底牌，随机玩家获得，最后展示（sout）所有人手上的牌
 */
public class Demo1PockerLandlord {
    public static void main(String[] args) {

        HashMap<Integer,String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        List<String> colors = List.of("♥", "♣", "♦", "♠");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        int index = 0;
        poker.put(index,"Joker");
        pokerIndex.add(index);
        index++;
        poker.put(index,"joker");
        index++;
        for(String color:colors){
            for(String number:numbers){
                poker.put(index,color+number);
                pokerIndex.add(index);
                index++;
            }
        }
        System.out.println(poker);
        System.out.println(pokerIndex);

        Collections.shuffle(pokerIndex);
        System.out.println(pokerIndex);
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> palm = new ArrayList<>();

        for (int i = 0; i < pokerIndex.size(); i++) {
            if(i>51){

            }
            else if(i%3==0){

            }
            else if(i%3==1){

            }
            else if(i%3==2){

            }
        }
    }


    /**
     * 返回一副完整的牌
     * @return
     */
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
