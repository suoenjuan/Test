import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//public class TestXiancheng {
//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        xiancheng1 x1=new xiancheng1();
//        xiancheng2 x2=new xiancheng2();
//        FutureTask<Integer> futureTask1=new FutureTask<Integer>(x1);
//        FutureTask<Integer> futureTask2=new FutureTask<Integer>(x2);
//
//        Thread thread=new Thread(futureTask1);
//        thread.start();
//        Thread thread1=new Thread(futureTask2);
//        thread1.start();
//        Integer i1=futureTask1.get();
//
//        Integer i2=futureTask2.get();
//        System.out.println("综合为:="+(i1+i2));
//    }
//}
