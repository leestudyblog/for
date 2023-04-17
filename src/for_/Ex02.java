package for_;

public class Ex02 {

	public static void main(String[] args) {
	int evenSum =0, oddSum=0;
	
	//홀수 짝수 합구하기
	for (int i=1; i<=10; i++) {
		
		if(i%2==0) {
			evenSum +=i;
			
		}//if end
		else  {
			oddSum +=1;
			
			
		}//else end
	}// for end
	
	System.out.println("1~10 짝수의 합:" + evenSum);
	System.out.println("1~10 홀수의 합:" + oddSum);

	}//main end

}
