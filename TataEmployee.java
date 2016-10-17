import java.util.Random;
public class TataEmployee extends Employee {
	public void generate(){
		Random r=new Random();
		int Identifier =r.nextInt(100);
		super.id= Identifier;
	}
	public static void main(String[] args){
		TataEmployee t=new TataEmployee();
		t.name="tata";
		t.generateId();
		t.getEmpDetails();
	}
}
