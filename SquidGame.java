// This game is based off of the trending Netflix KDrama SquidGame

import java.util.Scanner;

public class SquidGame {
    
    public static final void main(String[] args) {
        
        //These variables keep track of deaths and money along with minor randomized numerics.
        int numberInPreviousRound = 456;
        int numberAlive = 456;
        int playerNumber = (int)(Math.random() * 456);
        int deathCount = 0;
        int money = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name?");
        String name = scanner.nextLine();
        
        System.out.println("\nHello " + name + ". You are unemployed in South Korea with over 10 million Korean Won in debt");
        System.out.println("You have a daughter and an aging mother to take care of, but the banks are knocking at your door.");
        System.out.println("You see a man in the subway who offers you 50 thousand Won if you play him in a game of Ddakji. \n");
        
        System.out.println("Do you accept? Yes or No?");
        String answer = scanner.nextLine();
        
        if (answer.equals("Yes") || answer.equals("yes")) {
            
            System.out.println("\nAfter several attempts, you finally beat the strange man in Ddakji.");
            System.out.println("He asks you to join him in more games for cash. 46.5 million Won to be exact. You accept. \n"); 
            
            /* Red light green light can be programmed into the game. However, this game must ensure a winner.
             To guarantee the player advances to the next round, the player will automatically win. To
             The purpose of this section is to build suspense in the player. */
            System.out.println("You enter the first game as player number " + playerNumber + " of 456. The game: Red Light Green Light");
            System.out.println("A doll stands before you. You must make it to her but cannot move unless she says Green Light");
            System.out.println ("        ___         ");    
            System.out.println ("      (o   o)       ");  
            System.out.println ("   # (   -   ) #    ");  
            System.out.println ("     .-~'='~-.      ");
            System.out.println ("    /         \\    ");
            System.out.println ("    ||       ||     ");
            System.out.println ("    ||       ||     ");
            System.out.println ("    ||       ||     ");
            System.out.println ("   //_________\\\\  ");
            System.out.println ("    /         \\    ");
            System.out.println ("   /           \\   ");
            System.out.println ("  /             \\  ");
            System.out.println (" /_______________\\ ");
            System.out.println ("     ||     ||      ");
            System.out.println ("     ||     ||      ");
            
            //Here, half of the players are wiped out and the death count is used to calculate money.
            //Everytime there is a death, 100,000 is pooled into the winner's pile of cash.
            numberAlive = numberAlive / 2; 
            deathCount = numberInPreviousRound - numberAlive;
            numberInPreviousRound = numberAlive;
            money = deathCount * 100000;
            
            System.out.println("You barely survive. You realize this is a sinister compilation of Korean children's games. \nThe players who lose are brutally murdered. Only " + numberAlive + " players remain");
            System.out.println(deathCount + " players were eliminated. You see " + money + " pile into the winner's prize.");
            System.out.println("Despite the horrific deaths, you grow driven by greed. \n");
            
            System.out.println("The next game requires you to choose a shape. Pick carefully.");
            System.out.println("Type your desired shape: Circle, Triangle, Star, or Umbrella.");
            String shape = scanner.nextLine();
            
            /*Dalgona or honeycomb is a carmelized candy that can be carved out with a thin needle
              More complex shapes will break more easily. Circles, Triangle, and Stars almost never break, whereas Umbrella's have a high probability
              This game is a test of luck and probability of carving. */
            if (shape.equals("Circle") || shape.equals("circle") || shape.equals("Triangle") || shape.equals("triangle") ||shape.equals("Star") ||shape.equals("star") || Math.random() > 0.9) {
                System.out.println("\nYou were asked to remove this shape from a honeycomb/dalgona candy, and you won! ○ △ ⭑");
                System.out.println("Either the simple design or your sheer skill helped you achieve this win.");
                
                //Here, a random number of players must die, though at least 15 must remain for the game to continue  
                numberAlive -= Math.random() * (numberAlive - 15);
                deathCount = numberInPreviousRound - numberAlive;
                numberInPreviousRound = numberAlive;
                money += deathCount * 100000;
                
                //Players suddenly murder each other in the night, reducing the number of players
                System.out.println("\nYou survive, but others are brutally murdered. " + numberAlive + " players remain");
                System.out.println(deathCount + " players were eliminated. Now, you see " + money + " in the winner's prize.");
                
                System.out.println("\nPrepare to sleep. Are you enjoying the game:");
                String response = scanner.nextLine();
                System.out.println("\nInteresting");
                
                //15 players remain for the next game
                numberAlive = 15;
                deathCount = numberInPreviousRound - numberAlive;
                numberInPreviousRound = numberAlive;
                money += deathCount * 100000;
                
                System.out.println("\nIn fits of insanity, the players revolt and murder each other. You barely escape. Only " + numberAlive + " players remain");
                System.out.println(deathCount + " players were eliminated. Now, you see " + money + " in the winner's prize.");
                
                System.out.println("\n          /  /\\  \\");
                System.out.println("         /  /  \\  \\");
                System.out.println("        /  /    \\  \\");
                System.out.println("       /  /      \\  \\");                   
                System.out.println("      /  /        \\  \\");
                System.out.println("     /  /          \\  \\");                   
                 
                /* The next game is a diverging bridge. The player must choose to take the left or right step each move. The
                   Each step is a glass panel with a 50% chance of deaht. The bridgeOrder represents what time they will step on the bridge.Each
                   The later you step on, the higher likelihood you will no the way, as previous players would have found a path. */
                System.out.println("\nThe next game brings you to a diverging bridge. Choose a number between 1 and " + numberAlive + ":");
                int bridgeOrder = scanner.nextInt();
                
                System.out.println("\nYou have chosen number " + bridgeOrder + " in the order that you will step on the bridge.");
                System.out.println("The bridge is separate into left and right. You must choose left and right on each of the 10 steps to the finish line");
                System.out.println("Each step has a 50% chance of leading to your brutal demise");

                //Bridge order determines how many chances you have.
                // A larger number out of 15 is increased likelihood of survival. A
                //For example, number 10 would have 5 spaces left previous players would have died trying to commute to the finish line. 
                String glass = "Left";
                for (int i = 15 - bridgeOrder; i>0; i--) {
                     System.out.println("\n");
                     System.out.println("As order number " + bridgeOrder + ", you have " + i + " chances of survival. Choose Left or Right:");
                     String leftRight = scanner.next();
                     
                     //This for loop iterates the number of chances a player has.This
                     //The conditional statements allow the player to choose Left vs. Right with a 50% chance of survival.
                     glass = "Right";
                     if (Math.random() > 0.5) {
                         glass = "Left";
                     }
                     if (leftRight.equals(glass)) {
                         System.out.println("You made one step forward");
                     }
                     else {
                         System.out.println("\nYou fell through the bridge and died.");
                         System.exit(0);
                     }
                      
                     
               }
                
               System.out.println("\nCongrats! You made it across the bridge!");
               System.out.println("\nYou either chose a larger number or made it across with luck!");
              
               //Two players remain for the final close combat.
               numberAlive = 2;
               deathCount = numberInPreviousRound - numberAlive;
               numberInPreviousRound = numberAlive;
               money += deathCount * 100000;
                
               System.out.println("\nNot everyone, however, was as fortunate. The last " + numberAlive + " players remain");
               System.out.println(deathCount + " players were eliminated. There is " + money + " in the winner's prize. The stakes have never been higher.");
               
              
               /* In Squid Game, an offensive player must make it to the triangle, a head of the squid. In
                * The defensive member will push the other player out of the ring to win.The
                * Because the offensive has a knife in this violent game, the offensive player will nearly always win */
               System.out.println("\nThe next game is Squid Game. You and the other player, Sangwoo, will flip a coin to see who plays offense, the surefire path to victory.");
               if (Math.random() > 0.5) {
                 System.out.println("You are offense.");
                 
                 System.out.println("\nYOU WON SQUID GAME!");
                 System.out.println("\nYou can now go homw free of bankrupcy!");
               }
               else {
                 System.out.println("You are defense.");
                 System.out.println("\nYou lost Squid Game. The money slips through your fingers as Sangwoo overtakes you as he reaches the Squid's head.");
               }
             
            }
            else {
                //This is an umbrella death else
                System.out.println("\nYou were shot. The game required you to cut out this shape from a honeycomb.");
                System.out.println("The intricate design of the umbrella made this impossible. You died.");
                System.out.println("   .-^-.  ");
                System.out.println("  /_/_\\_\\ ");
                System.out.println("     |    ");  
                System.out.println("     j    ");
                                   
            }
            
        }
        else {
            //This is when a player refuses to play
            System.out.println("Very well. Contact us if you would like to play");
            System.out.println("                     ○ △ ▢                     ");
        }
  
    }
    
}
