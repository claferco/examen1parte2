package examen1parte2;
import java.util.Scanner;

public class ex1part2
{
		public static void main(String[] args)
		
		{
			// TODO Auto-generated method stub
			 
			Scanner s = new Scanner(System.in);


		        int nt1;
		        int nt2;
		        int nt3;
		        int nt4;

		        System.out.println("Alumno 1");
		        System.out.println("Escriba nota1: ");
		        nt1 = s.nextInt();
		        System.out.println("Escriba nota2: ");
		        nt2 = s.nextInt();
		        System.out.println("Escriba nota3: ");
		        nt3 = s.nextInt();
		        nt4 = ((nt1+nt2+nt3)/(3));
		        System.out.println("El promedio es: " + nt4);

		        if(nt4>=60){
		            System.out.println("Aprobado");
		        }else
		            System.out.println("Reprobado");

		         System.out.println("Alumno 2");
		        System.out.println("Escriba nota1: ");
		        nt1 = s.nextInt();
		        System.out.println("Escriba nota2: ");
		        nt2 = s.nextInt();
		        System.out.println("Escriba nota3: ");
		        nt3 = s.nextInt();
		        nt4 = ((nt1+nt2+nt3)/(3));
		        System.out.println("El promedio es: " + nt4);

		        if(nt4>=60){
		            System.out.println("Aprobado");
		        }else
		            System.out.println("Reprobado");

		        System.out.println("Alumno 3");
		        System.out.println("Escriba nota1: ");
		        nt1 = s.nextInt();
		        System.out.println("Escriba nota2: ");
		        nt2 = s.nextInt();
		        System.out.println("Escriba nota3: ");
		        nt3 = s.nextInt();
		        nt4 = ((nt1+nt2+nt3)/(3));
		        System.out.println("El promedio es: " + nt4);

		        if(nt4>=60){
		            System.out.println("Aprobado");
		        }else
		            System.out.println("Reprobado");
		}
}

