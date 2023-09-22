import java.util.*;
public class palindrome{
    public static void main(String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string: ");
        String p = sc.nextLine();
        char c[] = p.toCharArray();
        for (int i=0,j=c.length-1; i<(c.length)/2; i++,j--){
            if(c[i]!=c[j]){
                count++;
                break;
            }
        }
        if(count>0){
            System.out.println("not a palindrome");
        }
        else{
            System.out.println("Palindrome");
        }
    }
}