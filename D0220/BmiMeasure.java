package D0220;

public class BmiMeasure implements IMeasurer {
    @Override
    public double measures(Object obj) {
        if (obj instanceof Person){
            Person p = (Person) obj;
            return p.getWeight()/ (p.getHeight() * p.getHeight());

        }else {
            return -1;
        }

    }


}
