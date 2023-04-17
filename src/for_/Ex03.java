package for_;

public class Ex03 {

	public static void main(String[] args) {
		
		/*while (true) { //조건식
			int i=0;
			System.out.println(i+"test");
			i++;
			
		}*/
		
		int i;
		
		System.out.println("홀수 :");
		for( i=1; i<=19; i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+" ");
			}
		}
		
		System.out.println("짝수 :");

		for( i=1; i<=19; i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
			}
		}		
		
	}//main end

}
