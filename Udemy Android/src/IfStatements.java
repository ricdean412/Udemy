public class IfStatements {
    public static void main(String[] args) {

        String weather = "Raining";

        // here we are checking if it's raining or not (Single Line Comment)

        /*
        This is a multi-line comment.
         */

        if (weather.equals("Raining")){
            System.out.println("I am carrying an umbrella with me.");
        }
        else {
            System.out.println("I don't need an umbrella.");
        }

        // 1 to 5

        // 3 is good
        // 4 is very good
        // 5 is excellent

        int grade = 1;

        // == for Comparison
        // != for Not Equal
        if (grade == 5){
            System.out.println("Good!");
        } else if (grade == 4) {
            System.out.println("Very Good!");
        } else if (grade == 5){
            System.out.println("Excellent");
        } else {
            System.out.println("You have failed!");
        }

        // This means if grade is not Equal to 1 it will be true.
//        if (grade != 1){
//            //student has passed
//            System.out.println("Student passed!");
//        }


    }
}
