
public class RunnableDemo implements Runnable {

	String name;
	Thread t;
	
	public RunnableDemo(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i +"--"+ name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void startThread(){
		if(t == null){
			t = new Thread(this);
		}
		t.start();
	}
	
	public static void main(String[] args) {
		RunnableDemo t1 = new RunnableDemo("T1");
		t1.startThread();
		RunnableDemo t2 = new RunnableDemo("T2");
		t2.startThread();
		System.out.println("Completed");
	}
}
