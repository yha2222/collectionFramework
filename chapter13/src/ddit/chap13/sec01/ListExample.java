package ddit.chap13.sec01;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		//3.���׸� - �ڷ�Ÿ�� => Person Ŭ������ ���� => ȫ�浿 ���� ���� 
		//=> �Է� �� �������� üũ(������ �ϰ��� Ȯ��) + downcasting �� �ص� �����
		//ArrayList list = new ArrayList();
		System.out.println("list�� ũ��(default): "+list.size()); //����� �ڷ� ��
		list.add(new Person("ȫ�浿"));
		//1.Object obj = new Person("ȫ�浿");
		// �θ� ��ü�� ����Ǵ� �ڽ� ������!(��Ʈ�� ����) @Override�� �ڽ� �޼ҵ� toString���� ȣ���
		//2.�ϰ��� ������ �� ���� =����=>���׸�
		System.out.println("list�� ũ��: "+list.size());
		
		Person p1 = new Person("������");
		list.add(p1); //4. Ÿ�� ��ġ ��Ŵ
		//list.add("������"); //���ڿ��� ������ ��ü
		System.out.println("list�� ũ��: "+list.size());
		//list.add(100); //int �� -> �ڵ� ��ȯ auto boxing
		System.out.println("list�� ũ��: "+list.size());
		
		for(Object obj : list) { //Person Ŭ���� ��ü ��︶
			System.out.println(obj);
		}
		
		System.out.println(list); //�ּҰ� ���� ��� 
	}

}

class Person {
	String name;
	Person(){}
	Person(String name){
		this.name = name;  //ȫ�浿 ��µǴ� ����
	}
	
	@Override //�ּҰ� �������� ���� ��� ��
	public String toString() {
		return name;
	}
}