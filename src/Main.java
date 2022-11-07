public class Main {
    public static void main(String[] args) {
//*************************************** Exercise 1 ********************************************
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Exercise 1: initialisation");
        System.out.println("dog:\t" + dog + "\ncat:\t" + cat + "\npaper:\t" + paper);
//*************************************** Exercise 2 ********************************************
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("\nExercise 2: addition");
        System.out.println("dog:\t" + dog + "\ncat:\t" + cat + "\npaper:\t" + paper);
//*************************************** Exercise 3 ********************************************
        dog = dog - (int)3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("\nExercise 3: subtraction");
        System.out.println("dog:\t" + dog + "\ncat:\t" + cat + "\npaper:\t" + paper);
//*************************************** Exercise 4 ********************************************
        var friend = 19;
        System.out.println("\nExercise 4: Multi math operations 1");
        System.out.println("initial value:\t\t" + friend);
        friend = friend + 2;
        System.out.println("addition operation:\t" + friend);
        friend = friend/7;
        System.out.println("division operation:\t" + friend);

        var friendGroup2 = 19;
        System.out.println("\nPrint in one step " +
                "\ninitial value:\t\t" + friendGroup2 +
                "\naddition operation:\t" + (friendGroup2+2) +
                "\ndivision operation:\t" + (friendGroup2+2)/7);
//*************************************** Exercise 5 ********************************************
        var frog = 3.5;
        System.out.println("\nExercise 5: Multi math operations 2");
        System.out.println("initial value:\t\t\t\t" + frog);
        frog = frog * 10;
        System.out.println("multiplication operation:\t" + frog);
        frog = frog/3.5;
        System.out.println("division operation:\t\t\t" + frog);
        frog = frog + 4;
        System.out.println("addition operation:\t\t\t" + frog);

        var frogGroup2 = 3.5;
        System.out.println("\nPrint in one step " +
                "\ninitial value:\t\t\t\t" + frogGroup2 +
                "\nmultiplication operation:\t" + frogGroup2*10 +
                "\ndivision operation:\t\t\t" + frogGroup2*10/3.5 +
                "\naddition operation:\t\t\t" + (frogGroup2*10/3.5 +4));
//*************************************** Exercise 6 ********************************************
        var fighter1_Weight = 78.2;
        var fighter2_Weight = 82.7;
        System.out.println("\nExercise 6: Fighters weight 1");
        System.out.println("Fighters 1 weight:\t\t\t" + fighter1_Weight);
        System.out.println("Fighters 2 weight:\t\t\t" + fighter2_Weight);

        var fightersWeight_Tot = fighter1_Weight + fighter2_Weight;
        System.out.println("Fighters weight total:\t\t" + fightersWeight_Tot);

        var fighterWeight_Dif = Math.abs(fighter1_Weight - fighter2_Weight);
        System.out.println("Fighters weight difference:\t" + fighterWeight_Dif);
//*************************************** Exercise 7 ********************************************
        System.out.println("\nExercise 7: Fighters weight 2");
        fighterWeight_Dif = fighter2_Weight - fighter1_Weight;
        System.out.println("Fighters weight Max - Min:\t" + fighterWeight_Dif);
        fighterWeight_Dif = fighter2_Weight % fighter1_Weight;
        System.out.println("Fighters weight Modulus:\t" + fighterWeight_Dif);
//*************************************** Exercise 8 ********************************************
        var totalHours = 640;
        var workTime = 8;
        var numOfEmployees = totalHours/workTime;
        System.out.println("\nExercise 8: Number of employees");
        System.out.println("Number of employees:\t" + numOfEmployees);
        numOfEmployees = numOfEmployees + 94;
        workTime = totalHours/numOfEmployees;
        System.out.println("If " + numOfEmployees + " employees work in a company, then " + workTime + " hours per employee in a day");
    }
}