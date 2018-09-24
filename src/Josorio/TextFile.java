package Josorio;

import static Josorio.JosorioLib.*;

public class TextFile {

    public static void main(String[] args)
    {
        println("A series of tests!");
        String test = reverse("mistakes");
        println(test);
        String test1 = isFibonnaci(8) + "";
        println(test1);
        String test2 = sumUpTo(20) + "";
        println(test2);
        String test3 = isPalindrome("poop") + "";
        println(test3);
        String test4 = cutOut("poop", "o") + "";
        println(test4);
        String test5 = dateStr("05/14/2001") + "";
        println(test5);
    }
}
