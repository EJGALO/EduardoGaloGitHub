package cine;

public class Sala_2d extends Sala 
{
	int[] asientos=new int[40];
	public Sala_2d(int horario) 
	{
		super(horario);
	
	for(int i=0;i<30;i++)
	{
		asientos[i]=1;
	}
}
}
