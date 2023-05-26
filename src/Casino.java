import java.util.ArrayList;

public class Casino {

    public static void main(String[] args) {
        Casino callumsCasino = new Casino();
    }

    ArrayList<Card> deck;
    public Player[] players;
    int suit;
    int num;

    public Casino(){
        deck = new ArrayList<>();
        players = new Player[1];

        for(int x=0;x<players.length;x++){
            players[x] = new Player();
        }

        createDeck();
        deal();
        hitOrStand();
    }

    public void createDeck(){
        for(int x=0;x<4;x++){
            for(int y=2;y<15;y++){
                deck.add(new Card(x,y));
            }
        }
    }

    public void deal(){
        for(int x=0;x<2;x++) {
            for (int y = 0; y < players.length; y++) {
                suit = (int) (Math.random() * 3);
                num = (int) (Math.random() * 13) + 2;
                players[y].hand.add(new Card(suit, num));
                deck.remove(new Card(suit, num));
            }
        }
        System.out.println("You have a "+players[0].hand.get(0).name+" of "+players[0].hand.get(0).suit+" and a "+players[0].hand.get(1).name+" of "+players[0].hand.get(1).suit);
    }

    public void hitOrStand(){
        for(int x=0;x<2;x++){
            players[0].score = players[0].score + players[0].hand.get(x).value;
        }
        System.out.println("Your score is: "+players[0].score);

        for (int x=0;x<players.length;x++) {
            if(players[x].score<16){
                suit = (int) (Math.random() * 3);
                num = (int) (Math.random() * 13) + 2;
                players[x].hand.add(new Card(suit, num));
                System.out.println("You got a "+num+" of "+suit);
            }
        }
        for(int x=0;x<2;x++){
            players[0].score = players[0].score + players[0].hand.get(x).value;
        }
        System.out.println("Your score is: "+players[0].score);
    }
}
