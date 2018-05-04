package service.validation;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Loger {
    private static Logger ourInstance;

    public static Logger getInstance()
    {
        if(ourInstance == null) {
            ourInstance = Logger.getLogger(Loger.class.getName());
            ourInstance.setUseParentHandlers(false); // без вывода в консоль
            ourInstance.setLevel(Level.ALL);

            try {
                FileHandler file = new FileHandler("log.txt",true);
                file.setFormatter(new SimpleFormatter());
                ourInstance.addHandler(file);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return ourInstance;
        } else {
            return ourInstance;
        }
    }

    private Loger() {
    }
}