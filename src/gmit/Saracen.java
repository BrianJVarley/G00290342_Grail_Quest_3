package gmit;

/**
 * @author Brian Varley
 *
 */
public class Saracen implements GameCharacterInterface {
	
	private float lifeForce = 100.00f;
	private String name;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
        this.name = name;

		
	}
	

	
	
	//Once a run() returns, the thread dies
	public void run() {
		while (lifeForce > 0.00f){
			
			System.out.println("Saracen is running nearby");
			GameMap gm = new GameMap();
			Location start = gm.getStartNode();
			start.setVisited(true);
			BeamSearch bf = new BeamSearch();
			bf.search(start);
			
			
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
