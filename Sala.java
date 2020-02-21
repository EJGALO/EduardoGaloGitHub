package cine;

public class Sala 
{
	int horario;
	int[] asientos=new int[40];
	
	public Sala(int horario)
	{
		this.horario=horario;
		for(int i=0;i<40;i++)
		{
			asientos[i]=1;
		}
	}
}
