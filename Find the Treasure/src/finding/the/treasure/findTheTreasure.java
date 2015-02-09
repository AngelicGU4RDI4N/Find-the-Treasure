package finding.the.treasure;

import findTheTreasure.model.Player;


public class findTheTreasure {

   
    public static void main(String[] args) { 
        Player playerOne;
        playerOne = new Player();
   
        playerOne.setName("Jack Sparrow");
        playerOne.setGender("male");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }

}
