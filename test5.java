//we are here learning Methods
class computer

{
    public void playMusic()
    {
        System.out.println("Music is playing");
    }
    public String getPen(int cost)
    {
        return "Pen is given";
    }

}


public class Test5 {
    public static void main(String[] args) 
    {
            
        computer comp = new computer(); // this is how we call methods from another class
        comp.playMusic();
        String pen = comp.getPen(10);
        System.out.println(pen);


    }
}