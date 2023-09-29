package helpers;


import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import static com.sun.javafx.sg.prism.NGCanvas.RESET;
import static java.awt.Color.*;

public class ColorPrinter {
    public static void printMessageInYellow(String message){
        System.out.println(YELLOW + message + RESET);

    }
    public static void printColorMessage(String message, Logger logger, @NotNull Level level){
    switch (level){
    case INFO:
        logger.info(GREEN + message + RESET);
        break;
        case DEBUG:
            logger.info(BLUE + message + RESET);
            break;
        case ERROR:
            logger.info(RED + message + RESET);

}
    }
}
