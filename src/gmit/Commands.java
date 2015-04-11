package gmit;

/**
 * @author Brian Varley
 *
 */
public interface Commands {

	String move(String direction);

    String pickUp(String item);

    String use(String item);
    
    String kill(String gameCharacter);
}
