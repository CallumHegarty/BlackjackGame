public class Card {

    public String name;
    public String suit;
    public int value;

    public Card(int suitNum, int cardNum){

        if(suitNum==0){
            suit = "spades";
        }
        else if(suitNum==1){
            suit = "hearts";
        }
        else if(suitNum==2){
            suit = "diamonds";
        }
        else if (suitNum==3){
            suit = "clubs";
        }

        if(cardNum == 2){
            name = "two";
            value = cardNum;
        }
        else if(cardNum == 3){
            name = "three";
            value = cardNum;
        }
        else if(cardNum == 4){
            name = "four";
            value = cardNum;
        }
        else if(cardNum == 5){
            name = "five";
            value = cardNum;
        }
        else if(cardNum == 6){
            name = "six";
            value = cardNum;
        }
        else if(cardNum == 7){
            name = "seven";
            value = cardNum;
        }
        else if(cardNum == 8){
            name = "eight";
            value = cardNum;
        }
        else if(cardNum == 9){
            name = "nine";
            value = cardNum;
        }
        else  if(cardNum == 10){
            name = "ten";
            value = cardNum;
        }
        else if(cardNum == 11){
            name = "jack";
            value = 10;
        }
        else if(cardNum == 12){
            name = "queen";
            value = 10;
        }
        else if(cardNum == 13){
            name = "king";
            value = 10;
        }
        else if(cardNum == 14){
            name = "ace";
            value = 11;
        }
    }
}
