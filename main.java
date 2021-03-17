package scratches;

import java.io.*;




class Main {



    public static int printAgeMore18(){
        System.out.print("You READY?" + " Press Enter");
        System.out.println("LetGo!!!LetGo!!!");

        return 0;
    }
    public static int printAgeSmall18(){
        System.out.println("Your  small!!!! Get back pls!!!!");
        System.out.println("!!!!!!!Get back pls!!!!!!");

        return 0;
    }


    public static void threadSleep(){
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException ignore) {
            }
        }
        //System.out.println(matrixRain());
        //return matrixRain();
    }
/*здесь должна быть матрица
такого рода
1  3  5   7  9   8  0  5  4   4  9
 4     6   5          5  5  5 5  5
в  в а  п  п  в  а  в  п  п  ы  ы ы
*/
    public static int matrixRain(){

        return 0;
    }


    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


//сдесь создается цикл для с условием было ли введено что нибудь
    String name = new String();
    while (name.length() == 0){
        for(int i = 0; i == name.length(); i++) {
            System.out.print("Your name: ");
            name = reader.readLine();
            i++;
        }
    }
//обычная проверка на возраст
    System.out.print("Yor age: ");
    double age = Integer.parseInt(reader.readLine());
    if (age >= 18){
        System.out.println("Hi " + name + " " + age + ". " + "Your old.");
        printAgeMore18();
    } else {
        printAgeSmall18();
        threadSleep();
    }
  }
}