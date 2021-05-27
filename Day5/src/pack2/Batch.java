package pack2;

import java.util.Scanner;

public class Batch {
	
	private char batchName;
	Scanner scc = new Scanner(System.in);
	
	public void acceptBatchInfo()
	{
		System.out.println("—————————————————————————————————");
		System.out.println("Enter Batch: ");
		batchName = scc.next().charAt(0);
		scc.close();
	}
	
	public void displayBatchInfo()
	{
		System.out.println("Batch: "+batchName);
	}
	
}
