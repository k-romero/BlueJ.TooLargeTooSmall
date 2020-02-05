
/**
 * Write a description of class TooLargeTooSmall here.
 *
 * @author (Kevin HW)
 * @version (Feb 5)
 */
public class TooLargeTooSmall {
    private Integer chosenNum;

    /**
     * Constructor for objects of class TooLargeTooSmall
     */
    public TooLargeTooSmall(Integer seed) {
        // initialise instance variables
        chosenNum = seed;
    }

    public Integer guess(Integer g) {
        if (g > chosenNum){
            return 1;
        } else if (g < chosenNum){
            return -1;
        } else {
            return 0;
        }
        //return chosenNum; I guess this is here to completely trip you up or are you supposed to incorporate this?

    }
}
