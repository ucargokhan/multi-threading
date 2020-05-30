import java.util.concurrent.ThreadLocalRandom;

public class Yarisci3 implements Runnable
{
    private Thread thread;
    private String threadName;
    private int counter= 0;

    public Yarisci3(String threadName)
    {
        this.threadName = threadName;
        System.out.println("Yarışçı seçildi: "+threadName);
    }

    @Override
    public void run()
    {
        System.out.println("Yarışçı konumu: "+threadName);

        int counter= 0;

        try{
            for (int i=ThreadLocalRandom.current().nextInt(1, 10 + 1); i<=50; i++){
                System.out.println(threadName + " : "+i);
                this.counter++;
                Thread.sleep(2000);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }finally {
            System.out.println(threadName + " yarışı " + counter + " saniyede bitirdi.");
        }

        System.out.println("Yarışı bitirdi: "+threadName);

    }

    public void start()
    {
        System.out.println("Yarışa başlıyor "+threadName);
        if(thread == null)
        {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
