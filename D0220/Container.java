package D0220;

public class Container {
    public Object[] object = new Object[100];//

    public int index;//

    public void addObject (Object obj){
        if (index==100) {
            System.out. println ("容器己满! ") ;
            return ;
        }

        if (obj == null) {
            System.out.println("被测试对象不能为空! ");
            return;
        }
            object[index] = obj;
            // 下标值+1
            index++;

    }
    public void measure() {

    }
    public Object getMax(){
        return null;
    }
    public Object getMin(){
        return null;
    }
}
