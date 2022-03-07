package city_Project;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int choice;
		 Scanner sc = new Scanner(System.in);
		 
		 hotel obj=new hotel();
		 Transportation tp= new Transportation();
		 malls ms= new malls();
		 do {
		 System.out.println("*****Enter your choice!!*****");
		 System.out.println("1.Hotel name");
		 System.out.println("2.Tansportation_System");
		 System.out.println("3.Shopping_malls");
		
		  choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("*****Enter your choice*****");
				System.out.println("1.Hotel Prerna");
				System.out.println("2.Hotel om");
				System.out.println("3.Hotel Ganesh");
				System.out.println("4.Hotel Anvi");
				
				int n;
				do {
					n=sc.nextInt();
					switch(n) {
					case 1:
						obj.name1();;
						break;
					case 2:
						obj.name2();
						break;
					case 3:
						obj.name3();
						break;
					case 4:
						obj.name4();
						break;
					default:
						System.out.println("Invalid option!!!");
						break;	
					}
				}while(n!=4);
				break;
					
			case 2:
				System.out.println("Metro faclity");
				System.out.println("Bus faclity");
				int n1;
				do {
					n1=sc.nextInt();
					switch(n1) {
					case 1:
						System.out.println("**Metro**");
						tp.metro();
						break;
					case 2:
						System.out.println("**Bus**");
						tp.bus();
						break;
					}
				}while(n1!=2);
				break;
				
			case 3:
				System.out.println("__Best Shopping Malls__");
				ms.mall();
				break;
			
			
				
				default:
					System.out.println("Invalid");
					break;
			}
		 }while(choice!=4);
		 
		}


	}


