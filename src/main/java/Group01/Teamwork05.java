package Group01;

public class Teamwork05 {


    public static void main(String[] args) {



        System.out.println(studentShirtPrice(200, 10, 10 ));

    }

    public static int studentShirtPrice(int price, int discount,int age){

        if(age>18){
            return price- price*discount/100;
        }else{
            return price- price*discount/100 - price*10/100;
        }



    }


}
