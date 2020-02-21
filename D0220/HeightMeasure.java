package D0220;

public class HeightMeasure implements IMeasurer {

    public double measures(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            return person.getHeight();
        } else {
            return -1;
        }
    }
}




