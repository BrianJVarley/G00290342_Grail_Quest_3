package gmit;

/**
 * @author Brian
 *
 */
public class Saracen implements GameCharacterInterface{
	
	private float lifeForce = 100.00f;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
	

	
	
	//Once a run() returns, the thread dies
	public void run() {
		while (lifeForce > 0.00f){
			//Do some stuff. 
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(this.getName() + " has just died...");
	}
	
	
	

}
