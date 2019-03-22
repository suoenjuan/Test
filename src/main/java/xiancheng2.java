import java.util.concurrent.Callable;

public class xiancheng2 implements Callable {
    public Integer call() throws Exception {
        Integer num2=0;
        for(int i=51;i<=100;i++){
            num2+=i;
        }
        return num2;
    }
}
