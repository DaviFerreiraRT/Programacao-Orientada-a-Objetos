
public class Array {
	public static void somarArray(int x []) {
		x[2]=x[0]+x[1];
	}
	public static void main(String[] args) {
		int[]y=new int[3];
		 y[0]=1;
		 y[1]=10;
		 y[2]=20;
		 System.out.println("Antes:"+y[2]);
		 somarArray(y);
		 System.out.println("Depois:"+y[2]);


	}

}
