import java.util.Random;
class t2_1
{
    public static void main(String args[]) 
    {
        System.out.println("What would you like in breakfast ?");
        System.out.println("1 Bhakhri");
        System.out.println("2 Yogert");   
        System.out.println("3 Paraths");
        System.out.println("4 Waffles");
        System.out.println("5 Sandwich");
        System.out.println("6 Thepla");
        Random Rn = new Random();
        int ch = Rn.nextInt(6);
        System.out.println("\n the choice is \n");
        switch(ch)
        {
            case 1:
                 System.out.println("1 bhakhri");
            break;
            case 2:
                 System.out.println("2 yogert"); 
            break;  
            case 3:
                 System.out.println("3 paraths");
            break;
            case 4:
                 System.out.println("4 waffles");
            break;
            case 5:
                 System.out.println("5 sandwitch");
            break;
            case 6:
                 System.out.println("6 thepla");
            break;
            default:  
                 System.out.println("in valid choise");
            break;
        }
    }
}