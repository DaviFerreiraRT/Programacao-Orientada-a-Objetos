import java.util.ArrayList;

public class testeMotorVeiculoPeca {

	public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add("POO");
        al.add(20);
        al.remove(2);
        
        print(al);
    }

    public static void print(ArrayList a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
