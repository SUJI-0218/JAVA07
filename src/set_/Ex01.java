package set_;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		HashSet< String > set = new HashSet<String>();
		ArrayList<String > arr = new ArrayList<String>();
		set.add("라면"); set.add("김밥");
		set.add("순대"); set.add("라면");
		//set은 인덱스로 찾기 힘들기떄문에 중복된 값은 출력이 되지않음
		
		arr.add("라면"); arr.add("김밥");
		arr.add("순대"); arr.add("라면");
		//arr은 인덱스가 가능하기 때문에 중복된 값을 출력함
		
		System.out.println("set : " + set);
		System.out.println("arr : " + arr);
		
		System.out.println("----------------");
		//1~45
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		Random ran = new Random();
		for ( ;  6> arrInt.size() ; ) {
			int r = ran.nextInt(6) + 1;
			//if(arrInt.contains(r) == false ) {
			if(!arrInt.contains(r)) {//29번과 30번은 같은 식임
				arrInt.add( r );
				//중복이 나오지 않게 하기 위해서는 if문으로 조건을 줘야 함
			}
		}
		System.out.println("arrInt : " + arrInt);
		// 중복될 확률이 큼 중복이 되지않으려면 if문이 들어가야 됨
		
		HashSet<Integer> setInt = new HashSet<Integer>();
		for ( ;  6> setInt.size() ; ) {
			setInt.add( ran.nextInt(6)+ 1 );
			
		}
		System.out.println("setInt : " + setInt);
		
		
		
		
	}

}
