package be.intecbrussel.Willekeurig;

import java.util.Random;
import java.util.Scanner;

public class Dobbelsteen {

    static Random dobbelsteen = new Random();

    public static int roll(){
        return dobbelsteen.nextInt(6)+1;
    }

    public static void main(String[] args) {

        int aantal;
        Scanner scan = new Scanner(System.in);

            System.out.println("hoeveel keer wilt u gooien?: ");
            aantal = scan.nextInt();


        int [] rolls = new int[6];

        for (int i = 0; i<aantal; i++){
            int rolled = roll();
            rolls[rolled-1] +=1;
        }


        for (int i = 0; i<rolls.length; i++) {
            System.out.println("Amount of  " + (i + 1) + " rolled: " + rolls[i]);
            int procent =  rolls[i]*(aantal/100);
            System.out.println("in procenten : " +procent);
        }


    }
}
