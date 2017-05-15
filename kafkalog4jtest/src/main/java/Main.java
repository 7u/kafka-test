import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by tuyou006 on 2017/5/15.
 */
public class Main {
    public static void main(String[] args) {
        logger.info("Hello log4j!!!");
    }

    private static final Logger logger = LogManager.getLogger(Main.class);
}
