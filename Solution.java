import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex
{
    public final String pattern = (
        "(?:0?0?\\d|0?[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(?:\\.(?:0?0?\\d|0?[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}$"
    );


    public MyRegex() {}
}

//Write your code here