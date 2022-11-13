package vezbi_4;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)){
			int glava = 0;
			int pismo = 0;
	 System.out.println("Vnesete kolku pati sakate da ja frlite parickata");
	 		int num = in.nextInt();
	 		
	 		Brojac p1 = new Brojac();
	 		for(int count = 1; count <= num; count ++)
	 		{
	 			p1.frlanje();
	 			
	 			if(p1.glava())
	 				glava++;
	 			else
	 				pismo++;
	 		}
	 		System.out.println("Brojot na frlanje na parickata: " + num);
	 		System.out.println("Brojot na glavi: " + glava);
	 		System.out.println("Brojot na pisma: " + pismo);
		}}}