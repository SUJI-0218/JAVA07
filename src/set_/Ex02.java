package set_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		HashSet< String > set = new HashSet<String>();
		set.add("111");
		set.add("222");
		set.add("333");
		//boolean bool = set.remove("222");
		//인덱스가 없기떄문에 데이터로 함
		//System.out.println("bool : " + bool);
		//System.out.println("set : " + set);
		
		/*
		iterator(인터레이터)는 반복자라고 표현을함
		-컬렉션에 있는 값을 배열 형식으로 만들어준다
		-처음 위치는 bof, 마지막 위치는 eof
		-bof : 시작점, epf : 끝나는 지점
		웹쪽으로 가면 비슷한거를 많이 볼거임
		*/
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(111);
		arr.add(222);
		arr.add(333);
		Iterator <Integer> it = arr.iterator();
		//it는 bof 값을 먼저 알 수 있음
		while(it.hasNext()){
			System.out.println( it.next() );
		}
		//반복문을 사용하면서 계속 그 다음 값을 가져옴
		//333 이후로는 값이 없기때문에 반복문이 빠져나오게 됨
		
		
		/*
		System.out.println(it.hasNext());
		//hasNext() 다음 번째의 값이 있는지 물어보는 소스
		System.out.println(it.next());
		//다음 위치로 이동을 하고 그 값을 꺼내오는 역활을 함
		System.out.println(it.next());
		System.out.println(it.next());
		//next를 만나면서 it는 순차적으로 값이 이동을 함
		System.out.println(it.hasNext());
		System.out.println( it.next());
		*/
		
		System.out.println("----------------------------");
		Iterator<String> its = set.iterator();
		while( its.hasNext()) {
			String s = its.next();
			System.out.println( s );
		}

		
		
	}

}
