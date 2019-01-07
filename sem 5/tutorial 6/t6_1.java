class t6_1
{
    public static void main(String[] args) throws RuntimeException 
    {
        int arr[] = new int[6];
        int a[] = new int [args.length];
        int i=0;
        int j=0;
        //while(args[i]!="p")
        {
            a[i]=Integer.parseInt(args[i]);
            while(i!= args.length)
            {
                arr[j]=Integer.parseInt(args[i]);
                j++;
            }
            i++;
        }
        for(j=0;j<6;j++)
        {
            System.out.println(j);
            System.out.println(a[j] + " = " + arr[j]);
        }
    }
}