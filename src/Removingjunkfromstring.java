
public class Removingjunkfromstring {
public static void main(String[] args) {
	String s="&%#&%##@&% pankaj ravi  HAN ok";
	s=s.replaceAll("[^a-z0-9]", " ");
	System.out.println(s);
}
}
