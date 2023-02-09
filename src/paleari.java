import java.util.Scanner;

public class paleari
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
				//aggiungere, togliere casi a seconda delle proprie scelte
				case 1:
					es1();
				break;
				case 2:
					//Inserire metodo statico
				break;
				case 3:
					//Inserire metodo statico
				break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		
		System.out.println("1 - Es n. 1 - Titolo es. *");
		System.out.println("2 - Es n. * - Titolo es. *");
		System.out.println("3 - Es n. * - Titolo es. *");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}
	
	static void es1()
	{
	 int[] array1 = new int [3];
	 for(int i=0;i<array1.length;i++)
	 {
		 System.out.println("inserire un numero");
		 array1[i]= Integer.parseInt(in.nextLine());
 
	 }
	 int[] array2 = new int [3];
	 for(int i=0;i<array2.length;i++)
	 {
		 System.out.println("inserire un numero");
		 array2[i]= Integer.parseInt(in.nextLine());
 
	 }
	 int[] array3 = new int [array1.length + array2.length];
	 for(int i=0;i<array1.length;i++)
	 {
        array3[i]= array1[i];
     }
	 
	 for(int j=0;j<array2.length;j++)
	 {
	    array3[array1.length+ j]= array2[j];
	 }
	 for(int j=0;j<array3.length;j++)
		 for(int i=0;i<array3.length-1;i++)
		 if(array3[i]>array3[i+1])
		 {
			swap(array3,i,i+1);
		 }
	 
	 for(int i=0;i<array3.length;i++)
	 {
		 System.out.println(array3[i]);
	 }
	
	}	
	 static void es2()
	 {
		 
	 }
	 static void swap(int num[], int a, int b)
	 {
		 int temp=num[a];
		 num[a]=num[b];
		 num[b]= temp;
						 
	 }
	 
	 
}
