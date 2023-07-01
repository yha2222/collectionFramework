package ddit.chap13.sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListExample02 {

	public static void main(String[] args) {
		//입력 시 자료(데이터 타입) 검증, 원본 형태 클래스로 다운캐스팅 안해도 됨
		List<String> list = new ArrayList<String>();
		int res = 234;
		list.add("123"); 				 //<String>이랑 타입 맞춰줘야 오류 안 남
		list.add(String.valueOf(res));

		//List plist = new Vector();
		List<Person> plist = new Vector<Person>(); //Vector=ArrayList
		Person p1 = new Person("김길동");
		plist.add(p1);
		//add(Object obj){}
		//=> Object obj = new Person("김길동"); => [다형성]
		
		System.out.println(plist.get(0).name); //Object에 name 변수 없으니까 오류
	}

}
