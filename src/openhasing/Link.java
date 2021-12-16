package openhasing;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class Link {

    private int iData;
    public Link next;

    public Link(int iData) {
        this.iData = iData;
    }

    public int getKey() {
        return iData;
    }

    public void displayLink() {
        System.out.print(iData + "");
    }
}
