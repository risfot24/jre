package cmm02.op;

import java.util.Scanner;

public class No02_IfElseDemo {
   
	int big;
	public void getBig(int a, int b, int c ){ //static  �� �Ϲ��� ����..
		if(a > b && a > c){
			System.out.println("���� ū ���� A���� "+a+"�Դϴ�. ");
		}else if(b > a && b > c){
			System.out.println("���� ū ���� B���� "+b+"�Դϴ� . ");
		}else{
			System.out.println("���� ū ���� c���� "+c+"�Դϴ� . ");
		}
}
	
	
	public static void main(String[] args) {  //���α׷��� ��
		No02_IfElseDemo instance = new No02_IfElseDemo();
		  // static���� ��ü ���� �� �ٽ� �ؾ��ϳ�??
		  // static �� �ϴ� ���� �ٸ� �޼ҵ��̸� ���� ��ġ�� �� �ε� ������ ���� ��ü�� ������ �Ǵ��� ? ������?
		  // static �� ���� �޸𸮿� �ö󰣴�..
		String s = new String("sssss") ;
		String k = s.substring(0, 2);
		System.out.println(k);
		
		
		Scanner scan = new Scanner(System.in);
		                            
		                             //System(��ġ)  (in) Ű����
	                                 //System(��ġ) out �����	                               
	
		                            //System //����� ��üȭ ���������?
		                            //������ �����ϴ� �繰�� ���ؼ�        
		System.out.println("A ���� �Է��ϼ��� .");
		int a = scan.nextInt();
		System.out.println("b ���� �Է��ϼ��� . ");
		int b = scan.nextInt();
		System.out.println("C ���� �Է��ϼ��� . ");
		int c = scan.nextInt();
		instance.getBig(a , b , c); 
		
		
		//������ �͹̳����� 
		//void �� setter
		//���ϰ� getter 
		

	}

}
