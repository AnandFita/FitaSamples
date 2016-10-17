
public class ThreadDemo extends Thread {

	String name;
	
	public ThreadDemo(String name) {
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
	
	public static void main(String[] args) throws InterruptedException {
		ThreadDemo t1 = new ThreadDemo("T1");
		t1.start();
		ThreadDemo t2 = new ThreadDemo("T2");
		t2.start();
		System.out.println("Completed");
		System.out.println(Thread.currentThread().getName());
		
	}
}
