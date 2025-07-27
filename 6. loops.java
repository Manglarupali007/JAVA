public class loops {
    public static void main(String[] args) {
        System.out.println("For loop:");
        //for loop
        for(int i=1;i<=20;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }


System.out.println("While loop:");
        //while loop
        int n=1;
        while(n<10){
            System.out.println(n);
            n++;
        }


        System.out.println("do-while loop: ");
        //do-while 
        int j=1;
        do{
System.out.println("Hello");
j++;
        }
        while(j<=5);



        //print sum of first 10 natural numbers
        int sum=0;
        for(int i=0;i<=10;i++){
            sum+=i;
        }
        System.out.println(sum);



        //print a table of a number
        for(int i=0;i<=10;i++){
            System.out.println("2 X " +i + " = "+ (2*i));
        }
    }
}
