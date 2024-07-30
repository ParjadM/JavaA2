import java.util.Date;

public class GeometricShape { // public class marking.GeometricShape.GeometricShape extends Object {
    private String colour = "red";
    private boolean filled = true;
    private Date dateCreated = new Date();

    public GeometricShape() {

    }

    public GeometricShape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "colour = " + this.colour + ", filled = " + this.filled +
                ", and date created = " + dateCreated;
    }
}
