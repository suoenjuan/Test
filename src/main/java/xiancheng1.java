import java.util.concurrent.Callable;

public class xiancheng1 implements Callable {
    public Integer call() throws Exception {
        Integer num1=0;
        for(int i=0;i<=50;i++){
            num1+=i;
        }
        return num1;
    }
}
