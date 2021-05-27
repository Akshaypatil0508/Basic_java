

//7:Write a java program to convert char array into String.
public class Que7
{	
		public static String toString(char[] a)
		{
			String string = new String(a);
			return string;
		}


		public static void main(String args[])
		{
			
			char s[] = { 'A', 'k', 's', 'h',
						'a', 'y', 'p', 'a',
						't', 'i', 'l' };

			System.out.println(toString(s));
		}
	
}
/* output
  Akshaypatil */
