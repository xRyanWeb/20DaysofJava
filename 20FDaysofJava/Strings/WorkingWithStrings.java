public class WorkingWithStrings {

    public static void main(String[] args) {

        String name = "Ryan";
        String loveMessage = "I ";

        loveMessage += "Love " + name;
        System.out.println(loveMessage);

        loveMessage = "I Love Java";
        System.out.println(loveMessage);

        String fullName = "Hello: " + name + " James";
        fullName += " Good To See You";

        System.out.println(fullName);

    }

}
