public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);

        //Задача 2
        dog = dog + 4;
        System.out.println(dog);

        cat = cat + 4;
        System.out.println(cat);

        paper = paper + 4;
        System.out.println(paper);

        //Задача 3
        dog = dog - 3.5;
        System.out.println(dog);

        cat = cat - 1.6;
        System.out.println(cat);

        paper = paper - 7639;
        System.out.println(paper);

        //Задача 4
        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        //Задача 5
        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        //Задача 6
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var boxerWeight = boxerOne + boxerTwo;
        System.out.println("Общий вес боксеров " + boxerWeight + " кг");

        var boxersWeight = boxerTwo - boxerOne;
        System.out.println("Второй боец весит больше чем первый на " + boxersWeight + " кг");

        //Задача 7
        var usersWeight = boxerTwo % boxerOne;
        System.out.println(usersWeight);

        //Задача 8
        var generalTime = 640;
        var time = 8;
        var worker = generalTime / time;
        System.out.println("Всего работников в компании " + worker + " человек");

        worker = worker + 94;
        System.out.println("Столько человек работают на данный момент " + worker);

        var allTime = time * worker;
        System.out.println("Если в компании работает " + worker + " человека, то всего " + allTime + " часа работы может быть поделено между сотрудниками");


    }
}