package map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		HashMap<String , String > map = new HashMap<String, String>();
		
		map.put("이름" , "홍길동");
		map.put("나이" , "20");
		System.out.println("map : "+ map );
		System.out.println( " key set : "+ map.keySet());
		System.out.println( " values : "+ map.values());
		
		Set<String> set = map.keySet();
		System.out.println("set : " + set);
		
		Iterator<String > it =set.iterator();//get을 사용을 할 수가 없어서 인덱스를 가져오지 못함 그래서 Iterator을 사용을 해서 그 값을 가져옴 
		System.out.println(it.next());
		System.out.println(it.next());
		
		System.out.println(map.get("이름"));
		System.out.println(map.get("나이"));
		
		System.out.println("-------------------------------");
		it =set.iterator();//다시 받은 이유가 반복문을 쓰러면 처음부터 넘어와야 하기떄문에
		while( it.hasNext()) {
			String key = it.next();
			System.out.println(key + ":" + map.get(key));
		}
		
		/*System.out.println("-------------------------------");
		it =set.iterator();
		System.out.println( it.hasNext());
		while( it.hasNext()) {
			System.out.println(11111111);
			String key = it.next();
			System.out.println(key + ":" + map.get(key));*/
		}
	}


