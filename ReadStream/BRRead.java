/*************************************************************************
	> File Name: BRRead.java
	> Author: 
	> Mail: 
	> Created Time: 2015年11月16日 星期一 16时24分44秒
 ************************************************************************/
import java.io.*;
public class BRRead
{
    public static void main(String args[]) throws IOException{
        char  c;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Please Input Char, q is quit\n");
        do{
            c = (char)br.read();
            System.out.println(c);
        }while(c != 'q');
    }
}
