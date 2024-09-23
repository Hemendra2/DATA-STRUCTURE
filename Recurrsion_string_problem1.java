import java.util.Scanner;

public class Recurrsion_string_problem1 {
    static String removeoccurance(String s,int idx)
    {
        if(idx == s.length())
        {
            // base case of the recurrsion
            return " ";
        }
        // recurrance relation of the recurrsion 
        String smallans = removeoccurance(s, idx+1);
        // below this code part self work of the recurrsion
        char currchar = s.charAt(idx);
        if(currchar != 'a')
        {
            return currchar + smallans;
        }
        else
        {
             return smallans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  s = sc.nextLine();
        System.out.println(removeoccurance(s, 0));
    }
    
}
