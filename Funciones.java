package cine;

import java.util.Scanner;

public class Funciones 
{
	static Scanner read = new Scanner(System.in);
	int disp=0;
	public int disponible(int dimension, int asientos[])
	{
		for(int i=0;i<dimension;i++)
		{
			disp=disp+asientos[i];
		}
		return disp;
	}
	public void impsala(int dimension, int asientos[]) 
	{
		int i;
		int j;
		int k;
		k = 1;
		for (i=0;i<5;i++) {
			for (j=0;j<dimension/5;j++) 
			{
				if (asientos[k-1]==1) 
				{
					if (k<10) 
					{
						System.out.print(" "+k+" - ");
					} else {
						System.out.print(k+" - ");
					}
				}
				if (asientos[k-1]==0) 
				{
					System.out.print("XX - ");
				}
				k = k+1;
			}
			System.out.println("");
		}
	}

	public  double recaudacion(double tarifa, double valent, double entni, double entad) {
		double total=0;
		if (tarifa==1) 
		{
			System.out.println("total entradas:");
			System.out.println(entni+" entradas niños: "+entni*valent*8/10);
			System.out.println(entad+" entradas adultos: "+entad*valent);
			total = entad*valent+entni*valent*8/10;
			System.out.println("total a pagar: "+total);
		}
		if (tarifa==2) 
		{
			System.out.println("total entradas:");
			System.out.println(entni+" entradas niños: "+entni*valent*104/100);
			System.out.println(entad+" entradas adultos: "+entad*valent*13/10);
			total = entad*valent*13/10+entni*valent*104/100;
			System.out.println("total a pagar: "+total);
		}
		return total;
	}

	public void reserva(int entad, int entni, int asientos[], int dimension)
	{	
		int a=0;
		int z;
		while (a<entad+entni) 
		{
			System.out.println("elija asiento");
					z = read.nextInt();
					System.out.println(""); 
					if (asientos[z-1]==1) 
					{
						a = a+1;
						asientos[z-1] = 0;
						impsala(dimension, asientos);
					} 
					else 
					{
						System.out.println("asiento ocupado");
						System.out.println("");
						impsala(dimension, asientos);
					}
			}
			

}
}
