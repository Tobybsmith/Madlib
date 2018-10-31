/**
 * Fun For The Whole Family If You're A Socialist
 * Mad Lib Entertainment
 *
 * Made By Toby Smith for Mr. Jamieson's Computer Science
 * Due: November 4th
 */
import java.util.Scanner;
public class MadLib
{
        public static void madLib()
    {
        sign();
        //System.out.println(noun1 + noun2 + noun3 + adj1 + adj2);
        Scanner input = new Scanner(System.in); //New class, new scanner
        System.out.println("Welcome to Gang Weed's Mad Lib");
        System.out.println("Please input the following words");
        System.out.println("Adjective, Adjective, Verb (ing verb), Noun, Verb (past),");
        System.out.println("Noun, Verb (past), School Subject, Adjective, Adjective");
        System.out.println("Please wait while we compile your personalized story");
        String adj1 = wordStore(input.nextLine()); //Storing user input as string
        String adj2 = wordStore(input.nextLine()); //Variables with the wordStore method
        String verb1 = wordStore(input.nextLine());
        String noun1 = wordStore(input.nextLine());
        String verb2 = wordStore(input.nextLine());
        String noun2 = wordStore(input.nextLine());
        String verb3 = wordStore(input.nextLine());
        String subject = wordStore(input.nextLine());
        String adj3 = wordStore(input.nextLine());
        String adj4 = wordStore(input.nextLine());
        System.out.println("Once upon a time there was a very handsome person named Toby Smith.");
        System.out.println("He was very " + adj1 + " and extremely handsome and " + adj2 + ".");
        System.out.println("One day, Toby was " + verb1 +  " when suddenly he was attacked by a " + noun1 + ".");
        System.out.println("The " + noun1 + " said “Wow toby you are very handsome and smart“.");
        System.out.println("Toby responded with a thank you and " + verb2 + " to his " + noun2 + "’s house.");
        System.out.println("Once there, his " + noun2 + " said wow toby you are very smart and handsome and great at computer programming.");
        System.out.println("Toby was " + verb3 + " with compliments but this was normal for someone as handsome and smart as him.");
        System.out.println("Toby was very " + adj3 + " knowing he was smart and popular and " + adj4 + " at java programming.");
        System.out.println("Finally, Toby went home to work on his " + subject + " project (He Got A 100 of course).");
        System.out.println("The End!");
        sign();
    }
            public static String wordStore(String word)
    {
        Scanner sc = new Scanner(System.in);
        if(word.equals("rancid") || word.equals("Rancid"))
        {
            System.out.println("Nice Try Dexter");
            System.exit(0);
            return "nut";
        }
        
        return word;
    }
            public static void sign()
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~     Gang Weed     ~~");
        System.out.println("~~ Literary Division ~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
