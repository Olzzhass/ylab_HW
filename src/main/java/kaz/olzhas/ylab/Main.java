package kaz.olzhas.ylab;

import kaz.olzhas.ylab.handler.AdminHandler;
import kaz.olzhas.ylab.handler.MainHandler;
import kaz.olzhas.ylab.handler.UserHandler;
import kaz.olzhas.ylab.in.CoworkingServiceIn;

public class Main {
    public static void main(String[] args) {

        MainHandler mainHandler = new MainHandler();
        UserHandler userHandler = new UserHandler();
        AdminHandler adminHandler = new AdminHandler();

        //In sourcespwd
        
        CoworkingServiceIn in = new CoworkingServiceIn();
        in.start(mainHandler, userHandler, adminHandler);
    }
}
