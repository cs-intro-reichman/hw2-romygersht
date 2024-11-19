// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        
        String str1 = "" +(args[0]); //the string input
        int num1 = Integer.parseInt(args[1]); //numer input
        String str2 = "AEFHILMNORSX";
        String capital = "ABCDEFGHIJKLMNOPQRSTUVWSYZ";//creating a string including all the letters from the ABC
        String notCapital = "abcdefghijklmnopqrstuvwsyz";
        String str3 = " ";

           for (int l = 0; l<str1.length(); l++) {
                char ch = str1.charAt(l); //creating a char for the letter

                if (capital.indexOf(ch) == -1) { //if the letter is not capital, change it
                int i = 0;
                i = notCapital.indexOf(ch);
                ch = capital.charAt(i);
                }
                
                str3 = str3 +ch;

                if (str2.indexOf(ch)== -1) // if the letters in the str2 does not appear
        {      
                System.out.println("Give me a: "+ch+"!");
                
        }
                else // if they do apear
        {
                System.out.println("Give me an: "+ch+"!"); 
        }
                ch = str1.charAt(l); //+1 at the string
           }
           
           System.out.println("what does that spell?");
           
           while (num1 >0) { //printing the word as many times as the num // להפוך לאותיות גדולות
                System.out.println(str3+ "!!!");
                num1 --;
                }
        }
        
  }

