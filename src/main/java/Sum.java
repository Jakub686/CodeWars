public class Sum
{
    public int GetSum(int a, int b)
    {
        int result = 0;
        int min, max = 0;
        int c = 0;

        if(a>b){
            min =b;
            max =a;
        }else {
            min =a;
            max=b;
        } // min max
        c = (Math.abs(max-min))+1;
        System.out.println("amount of digits: " + c);
        int[] array = new int[c];

        for(int i = 0;i<c;i++){
            array[i] =min++;
        }
        for (int i = 0 ; i <c; i++){
            System.out.print(array[i]+ " ");
        }
        for (int i : array){
            result += i;
        }
        return result;
    }
}