public class Variables {
    public static void main(String[] args) {

        String ourfriendsName = "John";
        String myOtherFriend = "Max";
        if (myOtherFriend.equals(ourfriendsName)){
            System.out.println("Dope");
        }
//        int age = 22;
        float age = 22.0f;
        long ga = 4223432232112L;
        double ourfriendsHeight = 1.82;
        float floatVariable = 1.52342f;



        float result = (age * floatVariable);

        int roundedResult = Math.round(result);

        boolean someVariables = true;

        boolean someVariables2 = false;



        System.out.println("Our friend " +ourfriendsName+ " is "+age+" years old "+roundedResult);

    }
}
