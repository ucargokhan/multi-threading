public class Main {

    public static void main(String[] args)
    {
        Yarisci1 yarisci1 = new Yarisci1("Yarışçı 1");
        Yarisci2 yarisci2 = new Yarisci2("Yarışçı 2");
        Yarisci3 yarisci3 = new Yarisci3("Yarışçı 3");


        //these will generate random numbers as infinite loops...
        yarisci1.start();
        yarisci2.start();
        yarisci3.start();


    }
}
