package for_;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		  for(초기값; 조건식; 증강식){
		  	종속 문장
		  } 
		  반복문 사용할 경우
		  - 어떠한 식이 동일하게 동작해야 하는 경우
		  - 어떠한 값이 규칙적으로 변하는 경우
		 */
		
		int i=1, sum=0;
		
		//sum = sum+i; i++;
		//sum = sum+i; i++;
	    //sum = sum+i; i++; ...
		//윗문장 10 반복 밑 for문장 
		
		for (i=1; i<=10; i++) {
			sum = sum+i;
			System.out.println(sum);
			
		}
		System.out.println("i : "+ i);
		
		
		
		
		Scanner input =new Scanner(System.in);
		int num;
		System.out.println("반복 횟수 입력");
		num=input.nextInt();
		for (int k=0; k<num; k++) {
			System.out.println("k : "+ k);

		}
		

	}//method end

}//class end
