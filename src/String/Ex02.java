package String;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		String str1 = "       test         ";
		String str2 = "test      ";
		System.out.println( "111" + str1 + "111" );
		System.out.println( "111" + str2 + "111" );
		System.out.println( str1.equals(str2) );
		//false라고 뜨는게 공백으로 인해서

		System.out.println("----------trim----------");

		String s1 = str1.trim();
		String s2 = str2.trim();
		System.out.println( "111" + s1 + "111" );
		System.out.println( "111" + s2 + "111" );
		//trim은 제일 처음과 마지막의 공백들을 없애줌, 가운데 스페이스는 없애주지않음

		System.out.println("----------split----------");

		/*String addr = "01234 서울 노원구 동일로 1234";
		//주소를 적을때 띄어쓰기로 했는데 수정을 하기 위해서 찾아야 되는데 문자열을 원하는 구분자에 따라 나눌 때 유용함
		String[] s= addr.split(" ");
		System.out.println(s [0] );
		System.out.println(s [1] );*/

		String addr = "01234/서울/노원구/동일로 1234";

		String[] s= addr.split("/");
		System.out.println(s [0] );
		System.out.println(s [1] );
		System.out.println("----------반복문 출력----------");
		for(int i = 0 ; i < s.length ; i++ ) {
			System.out.println( s[i] );
		}	
		
		System.out.println("--------replace---------");
		String phone = "010-1234-1234";
		String replace = phone.replace("-","aaa");
		System.out.println(replace);
		//replace는 문자열 안에서 특정 문자열을 다른 문자열로 수정할떄 쓰임
		
		System.out.println(phone.charAt(2));
		//문자열에서 특정 인덱스에 있는 문자를 변환하는 메서드
		
		/*ArrayList<String> menu = new ArrayList<String>();
		menu.add
		Random r = new Random();
		int i = r.nextInt(3);
		System.out.println( menu.get(i));*/
		
		


	}

}
