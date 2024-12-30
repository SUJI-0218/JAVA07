package String;

public class Ex01 {
	public static void main(String[] args) {
		String str1;
		String str2 = new String();
		String str3 = "test";
		String str4 = new String("aaaa");//7번과 8번은 같은 코드임
		//System.out.println("str 1 :" +str1 ); 아무것도 지정을 하지않았기 때문에 에러가 뜸
		System.out.println("str 2 :" +str2);
		System.out.println("str 3 :" +str3);
		System.out.println("str 4 :" +str4);

		str4 = "Kim"; //kim , KIM
		System.out.println(str4.equals("kim"));
		//대,소문자를 비교하기 떄문에 같지않다. if문으로 줄 수 없기때문에 밑에 있는 소수로 지정해줌
		System.out.println(str4.toUpperCase());// 대문자출력
		System.out.println(str4.toLowerCase());// 소문자 출력

		System.out.println("---------------");
		String s = str4.toUpperCase();
		//if (s.equals("KIM")){
		if(str4.toUpperCase().equals("KIM")) {//.으로 되어있으면 순차적으로 따지면서 봄
			System.out.println("김씨!");
		}else {
			System.out.println("아니군");
		}
	}}
