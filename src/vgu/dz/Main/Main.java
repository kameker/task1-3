package vgu.dz.Main;


import vgu.dz.eleventh.DeleteHTML;
import vgu.dz.ninth.ninth;
import vgu.dz.tenth.Course;
import vgu.dz.tenth.Solution;
import vgu.dz.tenth.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String test1 = "<html><head><title>Моя страница</title><head><h1>Привет, Я Колян!<BR/>Закурить есть?</h1></head>/body>";
        String test2 = "<!DOCTYPE html>\n" +
                "<html lang=\"ru\">\n" +
                "  <head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Заголовок страницы</title>\n" +
                "    <link rel=\"stylesheet\" href=\"./styles/style.css\">\n" +
                "\n" +
                "    <meta property=\"og:title\" content=\"Заголовок страницы в OG\">\n" +
                "    <meta property=\"og:description\" content=\"Описание страницы в OG\">\n" +
                "    <meta property=\"og:image\" content=\"https://example.com/image.jpg\">\n" +
                "    <meta property=\"og:url\" content=\"https://example.com/\">\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <header>\n" +
                "      <h1>Личный сайт</h1>\n" +
                "      <p>Который сделан на основе готового шаблона</p>\n" +
                "      <nav>\n" +
                "        <ul>\n" +
                "          <li><a href=\"index.html\">Эта страница</a></li>\n" +
                "          <li><a href=\"catalog.html\">Другая страница</a></li>\n" +
                "        </ul>\n" +
                "      </nav>\n" +
                "    </header>\n" +
                "    <main>\n" +
                "      <article>\n" +
                "        <section>\n" +
                "          <h2>Первая секция</h2>\n" +
                "          <p>Она обо мне</p>\n" +
                "          <img src=\"images/image.png\" alt=\"Человек и пароход\">\n" +
                "          <p>Но может быть и о семантике, я пока не решил.</p>\n" +
                "        </section>\n" +
                "        <section>\n" +
                "          <h2>Вторая секция</h2>\n" +
                "          <p>Она тоже обо мне</p>\n" +
                "        </section>\n" +
                "        <section>\n" +
                "          <h2>И третья</h2>\n" +
                "          <p>Вы уже должны были начать догадываться.</p>\n" +
                "        </section>\n" +
                "      </article>\n" +
                "    </main>\n" +
                "    <footer>\n" +
                "      <p>Сюда бы я вписал информацию об авторе и ссылки на другие сайты</p>\n" +
                "    </footer>\n" +
                "    <!-- сюда можно подключить jquery <script src=\"scripts/app.js\" defer></script> -->\n" +
                "  </body>\n" +
                "</html>";
        String test3 = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <title>Моя первая веб-страница</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>Добро пожаловать на мою первую веб-страницу!</h1>\n" +
                "    <p>Это пример простого HTML-документа.</p>\n" +
                "</body>\n" +
                "</html>";
        String test4 = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <title>Простая веб-страница</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>Привет, мир!</h1>\n" +
                "    <p>Это моя первая веб-страница на HTML.</p>\n" +
                "</body>\n" +
                "</html>";
        String test5 = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <title>Стилизация веб-страницы</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            background-color: #f0f0f0;\n" +
                "            color: #333;\n" +
                "        }\n" +
                "        h1 {\n" +
                "            color: #0066cc;\n" +
                "        }\n" +
                "        p {\n" +
                "            font-size: 16px;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>Стилизация с помощью CSS</h1>\n" +
                "    <p>Этот текст стилизован с использованием CSS.</p>\n" +
                "</body>\n" +
                "</html>";
        System.out.println(DeleteHTML.deleteHTML(test5));
    }
}

