
### **Logging is a cool library that let you customize your logging**

### Log type

Logging has four types of logging:

* DEBUG
* INFO
* WARNING
* ERROR

With or without new line

### And there are a lot possibilities to customize your logging:

* BLACK
* RED
* GREEN
* YELLOW
* BLUE
* MAGENTA
* CYAN
* GRAY
* BLACK_BACKGROUND
* RED_BACKGROUND
* GREEN_BACKGROUND
* YELLOW_BACKGROUND
* BLUE_BACKGROUND
* MAGENTA_BACKGROUND
* CYAN_BACKGROUND
* GRAY_BACKGROUND
* BOLD
* UNDERLINE
* HIGH_CONTRAST
* NORMAL
* CLEAR

### As simple as counting 2 + 2

    Logging logging = new Logging(Logging.class);

    logging.setLogStyle(LogType.DEBUG, LogStyle.BLACK);
    logging.debugNl("Testing Log Debug - BLACK Style");

    logging.setLogStyle(LogType.INFO, LogStyle.BLUE);
    logging.infoNl("Testing Log Info - BLUE Style");

    logging.setLogStyle(LogType.WARNING, LogStyle.GREEN);
    logging.warningNl("Testing Log Warning - GREEN Style");

    logging.setLogStyle(LogType.ERROR, LogStyle.RED);
    logging.errorNl("Testing Log Error - RED Style");
  
  

## And the result will be:

![Logging sample](https://github.com/LenoirCZ/Logging/blob/master/logging_sample.png)
