package lianxi;

public class jiu {
	static int count=0;
	public static void main(String[] args) {
		jiu1(5,9,2);
		System.out.println(count);
	}

	private static void jiu1(int dian, int hua, int li) {
		if(li==1 && dian==0 && hua==0){
			count++;
		}
		if(dian>0) { jiu1(dian-1,hua,li*2);}
		if(hua>0) {jiu1(dian,hua-1,li-1);}
	}
}
