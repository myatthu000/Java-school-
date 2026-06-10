public class Number{
    public static void main(String[] args){

        System.out.printf("%10s %10s %10s %n","Number","Square","Cube");

        for(int i=0;i<=10;i++){
            System.out.printf("%10d %10d %10d %n",i,i*i,i*i*i);
        }
        System.out.println("");

    }
}