package cmm01.var;
/*
 Upcasting
 = ��ȯ(Conversion)
 = promotion
 = ������(implict) �ڵ���ȯ

: �ڹٰ� �����ϴ� �ڵ���ȯ���� �������� ����
������ Ÿ���� ǥ�������� �����ʿ��� ���� ������ ��ȯ �ɶ���
�����ϴ�. 
 
 */
public class No02_CastingDemo {
 public static void main(String[] args) {
   
   byte varByte = 1;
   int i = 123;
   double varDou = 123.456;
   
   int upByte = (int)varByte; // ���� �ص� �����ϴ�..
  // double upInt = varInt;
   /*
 Down-Casting
  = ĳ����(Casting)
  ���� �� ��ȯ
  : ���α׷����� ��������� �����ϴ� Ÿ�� ��ȯ.
  ��Һ�ȯ�� �Ǵ� ���� �ݵ�� ��������� ĳ�����Ͽ��� ��.
  ���� !!!! ������ �ս��� �߻��� �� �ִ�. 
    * */
   float varFlo = 123.456f;
   int downFlo = (int)varFlo ;
  // int downFlo2 = (int) varFlo ;
   // ������ ��Ŭ������ �ڵ������� ��ĥ�� �ְ� �Ͽ���... //�ڵ� ���� //���۷��� ����ȯ ������������ �׷��� �˾ƴ� ����..
   
    System.out.println("�ٿ� ĳ���� ��� �� : "+ downFlo);
   
	
 }
   
   
   
}
