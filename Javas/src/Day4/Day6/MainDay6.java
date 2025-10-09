package Day4.Day6;

public class MainDay6 {

    int x, y, z;
public static void main(String[] args) {
    MainDay6 m = new MainDay6();
    m.unary();
}
    public void unary(){
        x = 10;
        y = x++;
        System.out.println(y);
    }

}
