package cmm02.op;

public class No04_ConditionDemo {
    //op�ڵ� ��(operate code ��)
	
	// �͸� �Լ�(�̰� �ƴѰ� ����) ���°��� ����
	public static void main(String[] args) {
		int val01 = 1 ;
		int val02 = 2 ;
		
		//���α׷����� �������� ���°��� ���� �б��� �����Ѵ�.,,
		//��ü�� �����̴� , () condition ��  �� ���¿� ���� �ٲ�� �ȴ�..
		//() �ȿ� �ִ� ���� ���°� 
		 
		if((val01 == 1 ) && (val02 == 2 )){
			System.out.println("1���� �� 2������ �½��ϴ�.");
		
		}    //c���� �����϶��� () �����ص� ������, �ڹٴ� �׷��� ��������..

	    if((val01 != 1 ) || (val02 != 2)){// == || ==  ó���� �´� ���
	    	System.out.println("1���� �� 2������ �ٸ��ϴ� .");
	    }
	
	
	}
	
}
