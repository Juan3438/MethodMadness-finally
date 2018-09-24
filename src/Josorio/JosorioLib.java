package Josorio;

public class JosorioLib {

    public static void println(String str) {
        System.out.println(str);
    }

    public static String reverse(String var) {          // Here I take any string and reverse it by taking the last letter of the string and adding it to an empty string.
        String reversed = "";
        for(int i = var.length()-1;i >= 0;i--)
        {
            String letter = var.substring(i,i+1);
            reversed += letter;
        }
        return reversed;
    }

    public static boolean isFibonnaci(int num) {        // Here I create a simple loop with a conditional that repeats until it passes or is equal to the input.
        int FibIdx = 1;
        while(FibIdx < num)
            FibIdx += FibIdx;
        if(FibIdx == num)
            return true;
        else
            return false;
    }
    public static int sumUpTo(int num){             // I take num and create a for loop that keeps going until i is greater than the input num.
        int sum = 0;
        for(int i = 0;i<num;i++){
            sum += i;
        }
        return sum;
    }
    public static boolean isPalindrome(String str ){    // Here I call reverse and pass the input str as an argument then I compare test to str.
        String test = reverse(str);
        return (test.equals(str));
    }
    public static String cutOut(String mainStr, String subStr){     //I took the index of substring and then took the before and after of the substring.
        int idx = mainStr.indexOf(subStr);
        int fin = mainStr.length();
        String beginning = mainStr.substring(0,idx);
        String ending = mainStr. substring(idx+subStr.length(),fin);
        return (beginning + ending);
    }
    public static String dateStr(String input){     // Here I took apart the input date into months,dates, and years so It could be configured however.
        String month = input.substring(0,2);
        String date = input.substring(3,5);
        String year = input.substring(6,10);
        return (date +"-"+month+"-"+year);
    }
    public static String vigCipher(String message, String key){
        char alphabet[] = new []{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        message.toLowerCase();
        key.toLowerCase();
        String cipherText = "";
        for(int i = 0 ;  i <= message.length();i++)
        {
            int shift = key(i);
            for(int o = message[i] ; o != key)
        }
    }

}


















