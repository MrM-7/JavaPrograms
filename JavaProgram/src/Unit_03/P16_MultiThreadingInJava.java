package Unit_03;

/*
 * PC - STORES THE ADDRESS OF NEXT INSTRUCTION TO BE EXECUTED BY ONE PROCESSING UNIT
 * MULTI-THREADING -1. it is the users job find out the independent task of that process
 * 					2. let say your findings are t1,t2,t3,t4 tasks of process t1 out of 8 total tasks 
 * 					3. context switching b/w these tasks and the worst time is not decided by the user instead jvm will decide this all
 * 					4. Multi-threading is applied only when concurrent multitasking occurs.
 * 					5. it is the user job to put these independent code(task) into their respective thread T1,T2,T3 and T4;
 * 					6. user have to start these thread T1.start(),T2.start(),T3.start() & T4.start();
 */  				

public class P16_MultiThreadingInJava {

	public static void main(String[] args) {
		
//		MultiThreading obj=new MultiThreading();
//		obj.interThreadCommunication();
//		obj.ProductConsumerProblems();
//		obj.threadConcept();
//		obj.threadSynchronization();
		
		
		Thread t3 = new Thread(new T3(),"T3");
		Thread t2 = new Thread(new T2(),"T2");
		
		t3.start();
		t2.start();

	}

}

class C1{
	void show() {
		for(int i=0; i<5; i++)
		System.out.println(i + "Show 1 displayed");
	}
}

class C2
{
	void show()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println(i+ "Show 2 displayed");
		}
	}
}

//class MultiThreading{
//	void threadConcept() {
//		
//	}
//	void threadSynchronization() {
//		
//	}
//	void interThreadCommunication() {
//		
//	}
//	void ProductConsumerProblems() {
//		
//	}
//	void Wait_And_Notify() {
//		
//	}
//}

//class T1 extends Thread
//{
//	public void run()
//	{
//		
//			for(int i=0; i<5; i++)
//			System.out.println(i + " Show 1 displayed");
//	}
//}

class T3 extends Thread
{
	public void run()
	{
		try {
			Thread.sleep(5000);
			System.out.println("Now it is done!!!!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class T2 implements Runnable{
	public void run()
	{
			for(int i=0; i<5; i++)
			System.out.println(i + " Show 2 displayed");
	}
}