package gmit;

/**
 * @author Brian
 *
 */
public interface Commands {

	String move(String direction);

    String pickUp(String item);

    String use(String item);
}
