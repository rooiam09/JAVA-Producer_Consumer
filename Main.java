package producer_consumer;
public class Main 
{	public static void main(String a[])
	{	Buffer b = new Buffer();
		//anonymous object of producer and consumer
		new Producer(b);
		new Consumer(b);	
	}
}