import java.util.Scanner;

public class recurrsion_string_problem2 {
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
        return smallans + currchar;
    }
    public static void main(String[] args) {
        Scanner pd= new Scanner(System.in);
        String  s = pd.nextLine();
        System.out.println(removeoccurance(s, 0));
        
    }
}
