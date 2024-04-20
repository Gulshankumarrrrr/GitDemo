
public class Subset {

	
		public static void main(String[]args){

		String s="abraka";
		String sub;
		int a=s.length();

		for(int c=0; c<a; c++ ){
		for(int i=0; i<a-c; i++){
		sub=s.substring(c,c+i);
			
		System.out.println(sub);
		}
		}
}
}