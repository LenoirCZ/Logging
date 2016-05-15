
class Logging {

    private final String mClassName;
    private String mStyleDebug = "[34m";
    private String mStyleInfo = "[30m";
    private String mStyleWarning = "[33m";
    private String mStyleError = "[31m";

    public Logging(Class<?> clazz) {
        mClassName = clazz.getSimpleName();
    }

    public void debug(Object... messageComponents) {
        System.out.println((char)27 + mStyleDebug + String.valueOf(buildMessage(messageComponents)));
    }

    public void info(Object... messageComponents) {
        System.out.println((char)27 + mStyleInfo + String.valueOf(buildMessage(messageComponents)));
    }

    public void warning(Object... messageComponents) {
        System.out.println((char)27 + mStyleWarning + String.valueOf(buildMessage(messageComponents)));
    }

    public void error(Object... messageComponents) {
        System.out.println((char)27 + mStyleError + String.valueOf(buildMessage(messageComponents)));
    }

    public void debugNl(Object... messageComponents) {
        System.out.println((char)27 + mStyleDebug + String.valueOf(buildMessage(messageComponents)) + "\n");
    }

    public void infoNl(Object... messageComponents) {
        System.out.println((char)27 + mStyleInfo + String.valueOf(buildMessage(messageComponents)) + "\n");
    }

    public void warningNl(Object... messageComponents) {
        System.out.println((char)27 + mStyleWarning + String.valueOf(buildMessage(messageComponents)) + "\n");
    }

    public void errorNl(Object... messageComponents) {
        System.out.println((char)27 + mStyleError + String.valueOf(buildMessage(messageComponents)) + "\n");
    }

    private String buildMessage(Object... components) {
        String tmpMessage = "";

        for (int i = 0; i < components.length; i++) {
            if (i != 0) tmpMessage += " ";
            tmpMessage += (components[i] == null) ? "null" : components[i].toString();
        }

        return "[" + mClassName +"] " + tmpMessage;
    }

    public void setLogStyle(LogType type, LogStyle style) {

        String temp = "";

        switch (style) {
            case BLACK:
                temp = "[30m";
                break;
            case RED:
                temp = "[31m";
                break;
            case GREEN:
                temp = "[32m";
                break;
            case YELLOW:
                temp = "[33m";
                break;
            case BLUE:
                temp = "[34m";
                break;
            case MAGENTA:
                temp = "[35m";
                break;
            case CYAN:
                temp = "[36m";
                break;
            case GRAY:
                temp = "[37m";
                break;
            case BLACK_BACKGROUND:
                temp = "[40m";
                break;
            case RED_BACKGROUND:
                temp = "[41m";
                break;
            case GREEN_BACKGROUND:
                temp = "[42m";
                break;
            case YELLOW_BACKGROUND:
                temp = "[43m";
                break;
            case BLUE_BACKGROUND:
                temp = "[44m";
                break;
            case MAGENTA_BACKGROUND:
                temp = "[45m";
                break;
            case CYAN_BACKGROUND:
                temp = "[46m";
                break;
            case GRAY_BACKGROUND:
                temp = "[47m";
                break;
            case BOLD:
                temp = "[1m";
                break;
            case NORMAL:
                temp = "[21m";
                break;
            case UNDERLINE:
                temp = "[4m";
                break;
            case HIGH_CONTRAST:
                temp = "[7m";
                break;
            case CLEAR:
                temp = "[0m";
                break;
        }

        switch (type) {
            case DEBUG:
                mStyleDebug = temp;
                break;
            case INFO:
                mStyleInfo = temp;
                break;
            case WARNING:
                mStyleWarning = temp;
                break;
            case ERROR:
                mStyleError = temp;
                break;
        }
    }

    public static void printSample() {

        Logging logging = new Logging(Logging.class);

        logging.setLogStyle(LogType.INFO, LogStyle.BOLD);

        logging.infoNl("Default configuration: ");

        logging.setLogStyle(LogType.INFO, LogStyle.CLEAR);

        logging.debug("DEBUG - debug");
        logging.info("INFO - info");
        logging.warning("WARNING - warning");
        logging.errorNl("ERROR - error");

        logging.infoNl("--------------------------------");

        logging.setLogStyle(LogType.INFO, LogStyle.BOLD);
        logging.infoNl("Custom configuration: ");

        logging.setLogStyle(LogType.INFO, LogStyle.CLEAR);

        logging.setLogStyle(LogType.DEBUG, LogStyle.BLACK);
        logging.debugNl("Testing Log Debug - BLACK Style");

        logging.setLogStyle(LogType.INFO, LogStyle.BLUE);
        logging.infoNl("Testing Log Info - BLUE Style");

        logging.setLogStyle(LogType.WARNING, LogStyle.GREEN);
        logging.warningNl("Testing Log Warning - GREEN Style");

        logging.setLogStyle(LogType.WARNING, LogStyle.YELLOW);
        logging.warningNl("Testing Log Warning - YELLOW Style");

        logging.setLogStyle(LogType.ERROR, LogStyle.RED);
        logging.errorNl("Testing Log Error - RED Style");

        logging.setLogStyle(LogType.DEBUG, LogStyle.MAGENTA);
        logging.debugNl("Testing Log Debug - MAGENTA Style");

        logging.setLogStyle(LogType.INFO, LogStyle.GRAY);
        logging.infoNl("Testing Log Info - GRAY Style");

        logging.setLogStyle(LogType.WARNING, LogStyle.CYAN);
        logging.warningNl("Testing Log Warning - CYAN Style");

        logging.setLogStyle(LogType.ERROR, LogStyle.BLACK_BACKGROUND);
        logging.errorNl("Testing Log Error - BLACK_BACKGROUND Style");

        logging.setLogStyle(LogType.DEBUG, LogStyle.RED_BACKGROUND);
        logging.debugNl("Testing Log Debug - RED_BACKGROUND Style");

        logging.setLogStyle(LogType.INFO, LogStyle.BLUE_BACKGROUND);
        logging.infoNl("Testing Log Info - BLUE_BACKGROUND Style");

        logging.setLogStyle(LogType.INFO, LogStyle.BOLD);
        logging.infoNl("Testing Log Info - BOLD Style");

        logging.setLogStyle(LogType.WARNING, LogStyle.GREEN_BACKGROUND);
        logging.warningNl("Testing Log Warning - GREEN_BACKGROUND Style");

        logging.setLogStyle(LogType.WARNING, LogStyle.YELLOW_BACKGROUND);
        logging.warningNl("Testing Log Warning - YELLOW_BACKGROUND Style");

        logging.setLogStyle(LogType.ERROR, LogStyle.HIGH_CONTRAST);
        logging.errorNl("Testing Log Error - HIGH_CONTRAST Style");

        logging.setLogStyle(LogType.ERROR, LogStyle.MAGENTA_BACKGROUND);
        logging.errorNl("Testing Log Error - MAGENTA_BACKGROUND Style");

        logging.setLogStyle(LogType.DEBUG, LogStyle.CYAN_BACKGROUND);
        logging.debugNl("Testing Log Debug - CYAN_BACKGROUND Style");

        logging.setLogStyle(LogType.WARNING, LogStyle.GRAY_BACKGROUND);
        logging.warningNl("Testing Log Warning - GRAY_BACKGROUND Style");

        logging.setLogStyle(LogType.DEBUG, LogStyle.UNDERLINE);
        logging.debugNl("Testing Log Debug - UNDERLINE Style");

        logging.setLogStyle(LogType.INFO, LogStyle.NORMAL);
        logging.infoNl("Testing Log Info - NORMAL Style");

        logging.setLogStyle(LogType.DEBUG, LogStyle.CLEAR);
        logging.setLogStyle(LogType.INFO, LogStyle.CLEAR);
        logging.setLogStyle(LogType.WARNING, LogStyle.CLEAR);
        logging.setLogStyle(LogType.ERROR, LogStyle.CLEAR);
    }
}