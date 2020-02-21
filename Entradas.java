 package cine;

import java.util.Scanner;

public class Entradas 
{
	
	static Scanner read = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		int op=0;	
	while(op<=2)
	{	int horario=0;
	int entni=0;
	int entad=0;

		int t=1;
		Sala sala = new Sala(horario);
		Funciones fun = new Funciones();
		
		int valid = 0;
		int valid2 = 1;
		while (valid==0) 
		{
			System.out.println("MENU");
			System.out.println("");
			System.out.println("ELIJA UNA OPCÓN");
			System.out.println("");
			System.out.println("1.- Realizar venta");
			System.out.println("2.- obtener recaudacion total del dia");
			System.out.println("3.- salir");
			op=read.nextInt();
			System.out.println(""); 
			if (op==2 && t==1) 
			{
				valid = 0;
				System.out.println("NO CUMPLE VENTAS MÍNIMAS DIARIAS");
				System.out.println("");
			}
			if (op>3 && op<0) 
			{
				valid = 0;
				System.out.println("ESTA OPCIÓN NO EXISTE");
				System.out.println("");
			}
			if (op==1 || op==3) 
			{
				valid = 1;
			}
			if (op==2 && t==0) {
				System.out.println("EL TOTAL RECAUDADO ES: "/*+totaldia*/);
			}
		}
		valid = 0;
		if (op==1) {
			System.out.println(""); 
			while (valid==0) 
			{
				System.out.println("DETERMINE LA TARIFA DE COBRO");
				System.out.println("");
				System.out.println("1.- mañana");
				System.out.println("2.- tarde");
				horario=read.nextInt();
				System.out.println(""); 
				if (horario>3 || horario<0)
				{
					valid = 0;
					System.out.println("ESTA OPCIÓN NO ES VÁLIDA");
					System.out.println("");
				}
				 else 
				{
					valid = 1;
				}
			}
			System.out.println("");
			valid = 0;
			if (valid2==1) 
			{
				while (valid==0) 
				{
					System.out.println("ELIA UNA SALA");
					System.out.println("");
					System.out.println("1.- SALA 2D");
					System.out.println("VALOR ENTRADA: 2000");
					System.out.println("");
					System.out.println("2.- SALA 3D");
					System.out.println("VALOR ENTRADA: 3000");
					System.out.println("");
					System.out.println("3.- SALA 4DX");
					System.out.println("VALOR ENTRADA: 7000");
					System.out.println("");
					System.out.println("4.- SALA IMAX");
					System.out.println("VALOR ENTRADA: 5000");
					
					int tiposala = read.nextInt();
					System.out.println(""); 
					if (tiposala>4 || tiposala<0) 
					{
						valid = 0;
						System.out.println("ESTA SALA NO EXISTE");
						System.out.println("");
					}
					else
					{
						valid=1;
					}
					
				}
				valid = 0;
				
					System.out.println("ingrese cantidad de entradas niños");
					entni =read.nextInt();
					if (entni>=0) 
					{
						valid2 = 0;
						System.out.println(""); 
					
						System.out.println("");
						System.out.println("ingrese cantidad de entradas adultos");
						entad = read.nextInt();
						
						if (entad>=0) 
						{
							System.out.println(""); 
						
							if(fun.disponible(40, sala.asientos)<entni+entad)
							{
								valid = 0;
								System.out.println("NO QUEDAN SUFICIENTES ASIENTOS DISPONIBLES");
								System.out.println("ELIJA OTRA SALA");
							} else 
							{
								valid = 1;
							}
						} 
						else 
						{
							System.out.println("error de ingreso"); 
							valid2=1;
						}
					}
					else
					{
						System.out.println("error de ingreso");
						valid2=1;
					}
	}
	
	}
fun.impsala(40, sala.asientos);
fun.reserva(entad, entni, sala.asientos, 40);
	}
}
}

