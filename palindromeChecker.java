import java.util.Scanner;


public class palindromeChecker {

  public static Scanner s = new Scanner(System.in);

  public static void main(String[] args) {

    // take input
    System.out.println("Type in a string");

    String input = s.nextLine();
    checker(input);


  }

  public static void checker(String str){

    String strLowered = str.toLowerCase();
    String strSplit[] = strLowered.split("");
    String ch;
    String strReversed = "";
    String strCorrected[] = new String[strSplit.length];
    String strCompare = "";


    for (int i = 0; i < strSplit.length; i++){

      if (!strSplit[i].matches("^[\\p{P}\\s\\p{S}0-9]+$")){

        strCorrected[i] = strSplit[i];
        ch = strCorrected[i];
        strReversed = ch + strReversed;
        strCompare = strCompare + ch;





      } else {
        System.out.println("matches");
      }


    }



    System.out.println(strReversed);
    System.out.println(strCompare);

    if (strReversed.equals(strCompare)){
      System.out.println(str + " is a palindrome!");
    } else {
      System.out.println(str + " is not a palindrome");

    }



  }

}
