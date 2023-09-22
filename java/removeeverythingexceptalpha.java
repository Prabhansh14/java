import java.util.*;
public class removeeverythingexceptalpha{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String result ="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>=65 && c<=90 || c>=97 && c<=122){
                result += c;
            }
        }
    System.out.print(result);
}
}