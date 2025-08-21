public class Exemplo5 {

    public static void main(String[] args) {
        int x;
        int i = 1;
        x = (int)(Math.random() * 100);
         
        do{
            System.out.println(x + "*" + i + "=" + (x * i));
            i++;
        }
        while(i <= 10);
    }
    
}
