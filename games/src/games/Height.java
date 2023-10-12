
package games;

// creating Height class
public class Height {
	//instances of class
    private final int feet;
    private final int inches;
    // constructor 

    public Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }
//toInches method
    public int toInches() {
        return feet * 12 + inches;
    }

    @Override
    public String toString() {
        int normalizedInches = toInches() % 12;
        int normalizedFeet = toInches() / 12;
        // string formatting for numbers
        return String.format("%d' %d\"", normalizedFeet, normalizedInches);
    }
}
