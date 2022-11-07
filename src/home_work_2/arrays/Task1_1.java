package home_work_2.arrays;

public class Task1_1 {
    public static void main(String[] args)throws NumberFormatException{
    int i=0,a=0,b=1,convert;
    while(i<args.length){
        convert=Integer.parseInt(args[i]);
        a+= convert;
        b*= convert;
        i++;
    }
    System.out.print("Сумма: "+a+"\nПроизведение: "+b);
}
}

