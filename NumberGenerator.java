public class NumberGenerator implements Runnable{
    private String generator;
    public NumberGenerator(String generator)
    {
        this.generator=generator;
    }
    @Override
    public void run()
    {
        try
        {
            for(int i =0;i<=10;i++)
            {
                System.out.println(i+"in"+" "+generator);
                Thread.sleep(500);
            }
        }catch (InterruptedException e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }
}
