public class javaclass {
    public static void main(String[] args) {


        //Getting started with Hello World

        System.out.println("Hello World");
        System.out.println("How are you?");
        System.out.println("I hope everyone");
        System.out.println("Enjoying summer?");
        System.out.println("Welcome to the Nash Vlog");
        System.out.println("Welcome to Seattle central community Collage.");
        System.out.println(7 + 5 + 5);
        System.out.println(7 + 19 - 8);
        System.out.println(8 - 19 + 7);
        System.out.println(90 % 7 + 89);

        //variables

        String name = "kathmandu";
        System.out.println(name);
        int Num = 102;
        System.out.println(Num);
        float Deci = 1237 / 5;
        System.out.println(Deci);


        for (int i = 9; i < 20; i++) {
            if (i > 5 && i < 15) {
                continue;
            }
            System.out.println(i);
        }

        for (int sub = 10; sub < 15; sub++) {
            if (sub > 250 && sub < 300) {
                continue;
            }
            System.out.println(sub);
            for (int dev = 0; dev < 8; dev++) {
                if (dev > 10 && dev < 18) {
                    continue;

                }
                System.out.println(dev);
            }

        }

        String Raju = "Raja Ram";
        System.out.println(Raju);

        boolean su1 = false;
        boolean su2 = true;
        boolean su3 = (su1 == su2);
        boolean su4 = (su1 != su2);
        System.out.println(su1);
        System.out.println(su2);
        System.out.println(su3);
        System.out.println(su4);

        int age = 23;
        System.out.println(age + 6);
        System.out.println(++age);
        System.out.println(10 % 5);
        System.out.println(6 * 7);
        System.out.println(age + 6);
        System.out.println("New America 2024");

        int nepal = 27;
        System.out.println(++nepal);
        System.out.println(10 % 5);
        System.out.println(10 == 10);
        System.out.println(10 == 11);
        System.out.println(10 == 10 || 10 > 11);

        //loops

        String[] array = {"Nepal", "Kathmandu", "New-York", "Seattle", "Pokhara", "Chitwan"};
        for (String Id : array) {
            System.out.println(Id);
            System.out.println(array[1]);
            System.out.println(array[2]);
            System.out.println(array[3]);
            System.out.println(array[4]);
            System.out.println(array[5]);
            System.out.println(array[0]);


            int number = 5;

            if (number > 7) {
                System.out.println("This number is positive");
            } else if (number < 11) {
                System.out.println("This number is negative");
            } else {
                System.out.println("This number equals to 0");
            }


            //string Concatenation

            String Breakfast = "Cinnamon";
            int total_Breakfast_cost = 45;
            String lunch = "Avocado";
            int total_lunch_cost = 50;
            String Dinner = "Meatballs";
            int total_Dinner_cost = 55;
            String space = " total cost is ";

            //upperCase || lowerCase

            System.out.println(Breakfast.toUpperCase() + space + total_Breakfast_cost);
            System.out.println(lunch.toUpperCase() + space + total_Breakfast_cost);
            System.out.println(Dinner.toUpperCase() + space + total_Dinner_cost);
            System.out.println(Breakfast.toLowerCase());
            System.out.println(lunch.toLowerCase());
            System.out.println(Dinner.toLowerCase());


        }
        int Zipcode = 11373;
        String Borough = "Queens";

        if (Zipcode > 11374) {
            if (Borough == "Queens") {
                System.out.println("This is Elmhurst zipcode");
            }else if (Borough == "Brooklyn"){
                System.out.println("best place to live");

            }
        }else {
            if (Borough == "Queens") {
                System.out.println("I love Queens Borough");
            }else if (Borough == "Brooklyn"){
                System.out.println("great place");
            }
        }

        String txt = "A multitude of spelling variations characterize Norman surnames. " +
                "Many variations occurred because Old and Middle English lacked " +
                "any definite spelling rules. The introduction of Norman French " +
                "to \"England\" also had a pronounced effect, as did the court languages " +
                "of Latin and French. Therefore, one person was often referred to by " +
                "several different spellings in a single lifetime. The various spellings " +
                " Artus, Artson and many more.";
        System.out.println(txt.indexOf("England"));
        System.out.println(txt.indexOf("more"));
        System.out.println(txt.toUpperCase());
        System.out.println("The length of the text is including space: " + txt.length());
        System.out.println(txt.indexOf("lifetime"));

        int time = 0;
        String result = (time < 18) ? "Good Day.": "Good Evening.";
        System.out.println(result);

        int malingCode  = 12377;
        String adress = (malingCode < 12373) ? "Queens.": "Bronx.";
        System.out.println(adress);
    }
}
