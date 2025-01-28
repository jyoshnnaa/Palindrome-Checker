import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if Palindrome:");
        String str = sc.nextLine();

        if(isPalindrome(str)){
            System.out.println(str + " is a palindrome");
        }else{
            System.out.println(str + " is not palindrome");
        }
        sc.close();
    }
    public static boolean isPalindrome(String str){
        int left = 0 ;
        int right = str.length()-1;
        while (left<right) {
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
      
}