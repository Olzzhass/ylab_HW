package kaz.olzhas.ylab.handler;

public class MainHandler {

    public void displayMainPanel(){
        System.out.println("Добро пожаловать в наш Coworking Centre.");
        System.out.println("       Выберите действие:");
        System.out.println("1. Зарегестрироваться");
        System.out.println("2. Войти в существующий аккаунт");
        System.out.println("3. Выключить приложение");
    }

    //Метод для выхода из программы.
    public void quit(){
        System.out.println("До скорой встречи!");
        System.exit(0);
    }
}
