import java.util.*;
public class countvcs{
    public static void main(String[] args){
        int vowel=0, consonant=0, whitespace =0;
        System.out.print("enter string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == 'a'||c== 'e' || c== 'i' || c== 'o' || c== 'u' || c== 'A' || c== 'E' || c== 'I' || c== 'O' ||c == 'U'){
                vowel++;
            }
            else if(c == ' '){
                whitespace++;
            }
            else{
                consonant++;
            }
        }
        System.out.print("vowel="+vowel+"\n consonant:"+consonant+"\n whitespace:"+whitespace);
    }
}