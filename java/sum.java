import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        
        String num = "";
        int sum1 = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num += c;
            } else if (!num.isEmpty()) {
                int num1 = Integer.parseInt(num);
                sum1 += num1;
                num = "";
            }
        }
        if (!num.isEmpty()) {
            int num1 = Integer.parseInt(num);
            sum1 += num1;
        }
        System.out.println("Sum of numbers in the string: " + sum1);
    }
}
