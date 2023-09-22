import java.util.*;
public class capital{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        for(int i=0;i<s.length()-1;i++){
            char c1 = c[i];
            if(i==0 || c[i+1] == ' '){
                c[i]=Character.toUpperCase(c1);
            }
            else if(c[i-1]== ' '){
                c[i]=Character.toUpperCase(c1);
            }
        }
        c[s.length()-1]=Character.toUpperCase(c[s.length()-1]);
        s = new String(c);
    System.out.print(s);
}
}