package ddit.chap13.sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListExample02 {

	public static void main(String[] args) {
		//�Է� �� �ڷ�(������ Ÿ��) ����, ���� ���� Ŭ������ �ٿ�ĳ���� ���ص� ��
		List<String> list = new ArrayList<String>();
		int res = 234;
		list.add("123"); 				 //<String>�̶� Ÿ�� ������� ���� �� ��
		list.add(String.valueOf(res));

		//List plist = new Vector();
		List<Person> plist = new Vector<Person>(); //Vector=ArrayList
		Person p1 = new Person("��浿");
		plist.add(p1);
		//add(Object obj){}
		//=> Object obj = new Person("��浿"); => [������]
		
		System.out.println(plist.get(0).name); //Object�� name ���� �����ϱ� ����
	}

}
