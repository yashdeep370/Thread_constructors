// class myrun implements Runnable
// {
//     for default thread()
//     public void run(){
//        int i=1;
//     }
// }

class Mythread extends Thread
{
    public Mythread(String name)
    {
        super(name);
    }
}

public class theadtest {
    public static void main(String[] args) throws Exception{
        Mythread t =new Mythread("mythread1");
        // for thread(runnable r, string name)
        // Thread t = new Thread(new myrun(),"my name");
    }
}
