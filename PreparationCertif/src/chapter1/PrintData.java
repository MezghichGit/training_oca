package chapter1;

public class PrintData implements Runnable {
	
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println("Printing record: " + i);
	}
	
	public static void main(String[] args) {
		(new Thread(new PrintData())).start();
        (new Thread(new PrintData())).start();
    }
}