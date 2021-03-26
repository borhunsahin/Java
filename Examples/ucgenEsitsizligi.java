import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int sayac = 0;

        Random random = new Random();
        for(int i = 0 ; i < 10000 ; i++) {
            float x = random.nextFloat();
            float y = random.nextFloat();
            boolean deneme = deneme(Math.min(x,y), Math.max(x,y));
            if (deneme) {
                sayac++;
            }
            System.out.println(x + " - " + y + " -> " + deneme(Math.min(x, y), Math.max(x, y)));
        }

        System.out.println(sayac);

    }

    private static boolean deneme(float x , float y){

        float kenar1 = x;
        float kenar2 = y;
        float kenar3 = 1 - y;

        boolean deneme = true;

        if
        ((kenar1 > kenar2 + kenar3) || (kenar1 < Math.abs(kenar3 - kenar2))) {
            deneme = false;
        } else if ((kenar2 > kenar1 + kenar3) || (kenar2 < Math.abs(kenar3-kenar1) )) {
            deneme = false;
        } else if ((kenar3 > kenar1 + kenar2) || (kenar3 < Math.abs(kenar2-kenar1))) {
            deneme = false;
        }
        return deneme;
    }
}
