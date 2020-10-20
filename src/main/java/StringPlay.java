import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringPlay {

    public static Object isNumber(String input){
        //       Use"StringUtils" from apache library
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some data.");
        String userInfo = scan.nextLine();
        if(StringUtils.isNumeric(userInfo)){
            System.out.println("This is a Number!");
        } else{
            System.out.println("This is Not a Number.");
        }
       return null;
    }
    public static String flipCase(String input) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some data.");
        String userInfo = scan.nextLine();
        return StringUtils.swapCase(userInfo);
    }
    public static String reverseCase(String input){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some data.");
        String userInfo = scan.nextLine();
        return StringUtils.reverse(userInfo);
    }
    public static void main(String[] args) {
            isNumber("");
        System.out.println(reverseCase(""));
        System.out.println(flipCase(""));

    }
}
