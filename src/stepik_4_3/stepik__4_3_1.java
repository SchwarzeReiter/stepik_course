package stepik_4_3;

import java.util.logging.*;

/*
В этой задаче вам нужно реализовать метод, настраивающий параметры логирования. Конфигурирование в коде позволяет выполнить более тонкую и хитрую настройку, чем при помощи properties-файла.

Требуется выставить такие настройки, чтобы:

Логгер с именем "org.stepic.java.logging.ClassA" принимал сообщения всех уровней.
Логгер с именем "org.stepic.java.logging.ClassB" принимал только сообщения уровня WARNING и серьезнее.
Все сообщения, пришедшие от нижестоящих логгеров на уровень "org.stepic.java", независимо от серьезности сообщения печатались в консоль в формате XML (*) и не передавались вышестоящим обработчикам на уровнях "org.stepic", "org" и "".
Не упомянутые здесь настройки изменяться не должны.

(*) В реальных программах мы бы конечно печатали XML не в консоль, а в файл. Но проверяющая система не разрешает создавать файлы на диске, поэтому придется так.

Подсказки:

Level есть не только у Logger, но и у Handler.
Передача сообщения на обработку родительскому Handler'у регулируется свойством useParentHandlers.
 */
public class stepik__4_3_1 {

    private static void configureLogging() {
        // your implementation here
        Logger log1=Logger.getLogger("org.stepic.java.logging.ClassA"); //логгер а
        Logger log2= Logger.getLogger("org.stepic.java.logging.ClassB"); //логгер в
        Logger log3=Logger.getLogger("org.stepic.java");
        log1.setLevel(Level.ALL);
        log2.setLevel(Level.WARNING);
        log3.setLevel(Level.ALL);

        Handler handler=new ConsoleHandler();
        handler.setFormatter(new XMLFormatter());//XMLформаттер
        handler.setLevel(Level.ALL);
        log3.addHandler(handler);
        log3.setUseParentHandlers(false);// org.stepic.java
    }



}
