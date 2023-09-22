import java.util.*;
public class largestword{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String words []= s.split(" ");
        int max =words[0].length();
        String largestword = words[0];
        for(int i=1;i<words.length;i++){
            if(max<words[i].length()){
                largestword = words[i];
                max = words[i].length();
            }

        }
        System.out.println(largestword+" is the largest word in the string");
}
}