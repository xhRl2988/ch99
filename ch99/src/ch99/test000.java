package ch99;

public class test000 {
	public static void main(String[] args) {
		int sum=0;						//i의 값을 더할 변수 생성
		for(int i=1; i<=10; i++) {		//i의 값이 10이 될 때까지 반복 
			sum=sum+i;					//sum의 값+i	
			System.out.println(sum);	//sum의 값 출력
		}								//for문 종료
	}
}
