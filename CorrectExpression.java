//Example  input: 100+5=20  output: /

import java.util.*;
public class CorrectExpression {
    public static void main(String[] args){
        int x = 0, y = 0, z = 0;
	String s = new Scanner(System.in).nextLine();
        String str[] = s.split("=");
        for(int i = 0; i<str[0].length(); i++){
            if(str[0].charAt(i)=='+' || str[0].charAt(i)=='-' || str[0].charAt(i)=='*' || str[0].charAt(i)=='/'){
                String c = Character.toString(str[0].charAt(i));
                String st[] = str[0].split("\\"+c);
                x = Integer.parseInt(st[0]);
                y = Integer.parseInt(st[1]);
                z = Integer.parseInt(str[1]);
                break;
            }
        }
        if(x+y==z){
            System.out.println("+");
        }else if(x-y==z){
            System.out.println("-");
        }else if(x*y==z){
            System.out.println("*");
        }else if(x/y==z){
            System.out.println("/");
        }else{
            System.out.println("No Operator can correct the expression");
        }
    }
}
