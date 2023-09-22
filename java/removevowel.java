import java.util.*;
public class removevowel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String result = "";
          for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!(c == 'a'||c== 'e' || c== 'i' || c== 'o' || c== 'u' || c== 'A' || c== 'E' || c== 'I' || c== 'O' ||c == 'U')){
                result += c;
        }
    }
    System.out.print(result);
}
}