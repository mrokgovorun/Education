package complex;

/**
 * Created with IntelliJ IDEA.
 * User: Александр
 * Date: 04.11.13
 * Time: 0:08
 * To change this template use File | Settings | File Templates.
 */
public class Complex {
    private int x;
    private int y;
    public void setX(int a){
        x = a;
    }
    public void setY(int s){
        y = s;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public Complex(int a, int s){
        x = a;
        y = s;
    }

}
