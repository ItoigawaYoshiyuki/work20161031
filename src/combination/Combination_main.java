package combination;
import combination.Combination_lib;
import java.util.Scanner;
public class Combination_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("input Number s> ");
		int s=Integer.parseInt(scan.next());
		System.out.print("input Number r> ");
 	    int r=Integer.parseInt(scan.next());
		 
		Combination_lib clib= new Combination_lib();
		System.out.println(s+"!="+clib.getFaction(s));

		System.out.println(s+"C"+r+"="+clib.getFaction(s)/(clib.getFaction(r)*clib.getFaction(s-r)));
	}

}
