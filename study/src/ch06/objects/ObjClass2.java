package ch06.objects;

/*
 * 6
 * 2.2.��ü�� �ν��Ͻ�
 */
public class ObjClass2 {

	public static void main(String[] args) {
		/*��ü = �ν��Ͻ�
		 * new Ŭ������(); �� ����� ��ü��� �ϰ� �ν��Ͻ������ �Ѵ�.
		 * new ��Ű�� ������ �ν��Ͻ�ȭ �ϰ� �Ѵ�.
		 * �ν��Ͻ�ȭ �� ���Ŀ� ��ü �Ǵ� �ν��Ͻ��� �����ȴ�.
		 * ��ü �Ǵ� �ν��Ͻ��� ������ ������ �޸𸮶�� ���� ��ǥ�� 
		 * ����Ű�� ���� �������� �ǹ� �Ѵ�.
		 * �����, ����� ��� �ִ����� ������ �����̶�� ���� ��ǥ�� �ִ� ��ó��
		 * ��ü �Ǵ� �ν��Ͻ��� ������ ������� ����� ¥ ���� ���α׷��� ���ؼ� 
		 * ���� �ȴ�.
		 */
		/*ObjClass3 �� �����ϸ�, ��Ŭ������ �������� ���ϰ� �ȴ�.
		 * �ֳĸ�, ��ü �Ǵ� �ν��Ͻ��� �������� �ʾұ⶧���� �������� �ʱ� �����̴�.
		 * �׷� ���� �ϰ� �Ϸ��� new ObjClass3(); ó�� �� �־�� �Ѵ�.
		 * �̷��� �Ǹ� "Objclass3�� Ŭ������ ��ü �Ǵ� �ν��Ͻ�" ��� �����Ͽ��� �Ѵ�.
		 * Ŭ���� = ��ü(�ν��Ͻ�) �� ����� �������� �ʴ´�.
		 * Ŭ������� ���赵�� �����Ͽ� ������ü�� ����ٴ� �ǹ̷� ���� �Ͽ��� �Ѵ�. 
		 */
		new ObjClass3(); // ���� ��ü �Ǵ� �ν��Ͻ��� �Ǿ���.
		
		// ������ü ��� ���� �ǹ��ϱ� ���Ͽ� �ϳ��� ������ ����.
		new ObjClass3();

	}

}

class ObjClass3 {
	static int count = 0;
	
	ObjClass3(){
		count++;
		System.out.println(count+" ��° ObjClass3 ��ü");
	}
}