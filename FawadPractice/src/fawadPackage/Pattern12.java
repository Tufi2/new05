package fawadPackage;

public class Pattern12 {

	public static void main(String[] args) {
	  
		int n = 9;
		for(int i = 0;i<n;i++)
	 	{
			for(int k = 0;k<(n-1)-i;k++)
			{
				System.out.print(" ");
			}
			for(int j = 0;j<=i;j++)
			{
				if(j==0||j==i||i==n-1)
				{
					System.out.print(j+1+ " " );
				}
				else
				{
					System.out.print("  ");
				}
				
               				
			}
			System.out.println();
		}
				

	}

}
