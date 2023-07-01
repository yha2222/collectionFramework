package ddit.chap13.sec01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Map -> List�� ��ȯ �� ����� �� �߰� �Ű��� => Set
public class MapExample01 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		//*HashMap<String, String> map
		map.put("230101", "ȫ�浿");
		map.put("230102", "�̼���");
		map.put("230103", "������");
		map.put("230104", "������");
		
		System.out.println(map.get("230101"));
		//��ü�˻�(keySet() �̿�)
		Set keySet = map.keySet();
		//*Set <String>keySet
		//Iterator => �÷����� ������ �������̽�, iter => �ϳ��� ������ �� �ִ� ��� ���� ��ü
		//��� Ű�� ���� ���·� ��ȯ => keySet, �ݺ��� ����
		Iterator iter = keySet.iterator();
		//Iterator<String>
					//hasNext() - ������ ��, ������ ���� => while�� ���ǹ�
		while(iter.hasNext()) {
			String key = (String)iter.next(); //����� Ű �� ù��° ������(Object Ÿ�� => Map�� ����־���)
			String value = (String)map.get(key); //���⼭ �ٿ�ĳ����(String) ������ * 
			
			System.out.printf("%6s  %10s\n", key, value);
		}
		
		//��ü�˻�(entrySet() �̿�) - ȿ��! => �ڷ� ã�� �� ���
			//set Ÿ��
		Set <Map.Entry<String, String>> entrySet = map.entrySet(); //entrySet�̶�� ��ü ����
		Iterator<Map.Entry<String, String>> eiter = //�ݺ��� �̸�
				entrySet.iterator();
		//entry�� �ݺ��� ����
		while(eiter.hasNext()) {
			Map.Entry<String, String> entry = eiter.next(); //���� �ڷ� �ϳ���(Map.Entry)������
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.printf("%6s %-10s\n", key, value);
		}
	}

}
