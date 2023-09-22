import java.util.*;
public class anagram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter string 2: ");
        String s2 = sc.nextLine();
        if(s1.length() == s2.length()) {
            char c1 []= s1.toCharArray();
            char c2 []= s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            s1 = new String(c1);
            s2 = new String(c2);
            if(s1.equals(s2)){
                System.out.print("Anagram!");
            }
            else{
                System.out.println("Not Anagram!");
            }
        }
        else{
            System.out.print("Not Anagram!");
        }
}
}