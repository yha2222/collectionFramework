package ddit.chap13.sec01;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		//3.제네릭 - 자료타입 => Person 클래스로 제한 => 홍길동 빼고 오류 
		//=> 입력 시 데이터형 체크(데이터 일관성 확보) + downcasting 안 해도 수행됨
		//ArrayList list = new ArrayList();
		System.out.println("list의 크기(default): "+list.size()); //저장된 자료 수
		list.add(new Person("홍길동"));
		//1.Object obj = new Person("홍길동");
		// 부모 객체에 저장되는 자식 다형성!(컨트롤 용이) @Override된 자식 메소드 toString으로 호출됨
		//2.일관성 없어질 수 있음 =보완=>제네릭
		System.out.println("list의 크기: "+list.size());
		
		Person p1 = new Person("정몽주");
		list.add(p1); //4. 타입 일치 시킴
		//list.add("정몽주"); //문자열인 정몽주 객체
		System.out.println("list의 크기: "+list.size());
		//list.add(100); //int 들어감 -> 자동 변환 auto boxing
		System.out.println("list의 크기: "+list.size());
		
		for(Object obj : list) { //Person 클래스 객체 들억마
			System.out.println(obj);
		}
		
		System.out.println(list); //주소값 직접 출력 
	}

}

class Person {
	String name;
	Person(){}
	Person(String name){
		this.name = name;  //홍길동 출력되는 이유
	}
	
	@Override //주소값 찍지말고 내용 찍게 함
	public String toString() {
		return name;
	}
}