package discussion;

abstract class Cars {
	private int noOftyres;

	private void start(){
		System.out.println("started");
	}
	public void stop() {
		start();
		System.out.println("stopped");
	}
}
