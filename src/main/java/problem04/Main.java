package problem04;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Random r=new Random();
		int N=0;
		int s=0;int b=0;int o=0;
		Scanner sc=new Scanner(System.in);
		//System.out.print(r.nextInt(1000));
		//int answer=r.nextInt(1000);
	int answer=783;
		String s1=String.valueOf(answer);
		long start = System.currentTimeMillis();
		while(s!=3) {
			N++;
			s=0;b=0;o=0;
		System.out.print(">");
		int num=sc.nextInt();
         String s2=String.valueOf(num);  	
		
         for(int i=0;i<3;i++) {
        	 if(s1.charAt(i)==s2.charAt(i)) {
        		 s++;
        	 }
         }
         for(int i=0;i<3;i++) {
        	 for(int j=0;j<3;j++) {
        		 if(s1.charAt(i)==(s2.charAt(j))) {
        			 b++;
        		 }
        	 }
        	 
         }
		b=b-s;
   o=3-(s+b);
		System.out.println(N+"-S:"+s+",B:"+b+", O:"+o);
	}
		

		// 여기서 원하는 작업을 해 줍니다.

		long end = System.currentTimeMillis();

		long time = end - start;

		System.out.println("걸린 시간: " +time/1000 + "초");



	
		
	}
}