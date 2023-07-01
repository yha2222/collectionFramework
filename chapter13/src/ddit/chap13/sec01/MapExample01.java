package ddit.chap13.sec01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Map -> List로 변환 후 사용할 때 중간 매개자 => Set
public class MapExample01 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		//*HashMap<String, String> map
		map.put("230101", "홍길동");
		map.put("230102", "이순신");
		map.put("230103", "강감찬");
		map.put("230104", "정몽주");
		
		System.out.println(map.get("230101"));
		//전체검색(keySet() 이용)
		Set keySet = map.keySet();
		//*Set <String>keySet
		//Iterator => 컬렉션이 구현한 인터페이스, iter => 하나씩 꺼내올 수 있는 기능 가진 객체
		//모든 키를 집합 형태로 반환 => keySet, 반복자 생성
		Iterator iter = keySet.iterator();
		//Iterator<String>
					//hasNext() - 있으면 참, 없으면 거짓 => while문 조건문
		while(iter.hasNext()) {
			String key = (String)iter.next(); //저장된 키 중 첫번째 가져옴(Object 타입 => Map에 들어있었음)
			String value = (String)map.get(key); //여기서 다운캐스팅(String) 싫으면 * 
			
			System.out.printf("%6s  %10s\n", key, value);
		}
		
		//전체검색(entrySet() 이용) - 효율! => 자료 찾을 때 사용
			//set 타입
		Set <Map.Entry<String, String>> entrySet = map.entrySet(); //entrySet이라는 객체 생성
		Iterator<Map.Entry<String, String>> eiter = //반복자 이름
				entrySet.iterator();
		//entry에 반복자 적용
		while(eiter.hasNext()) {
			Map.Entry<String, String> entry = eiter.next(); //다음 자료 하나씩(Map.Entry)꺼내옴
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.printf("%6s %-10s\n", key, value);
		}
	}

}
