
# Дипломный проект по автоматизации тестирования сайта [wikipedia](https://ru.wikipedia.org/)
<p align="center">
<a href="https://olx.kz"><img src="images\logo\Wikipedia-logo.svg" width="150" height=150"  alt="wiki-logo"/></a>
</p>


##	Содержание

- [Технологии и инструменты](#technologist-технологии-и-инструменты)
- [Реализованы проверки](#bookmark_tabs-реализованные-проверки)
- [Запуск тестов из терминала](#computer-запуск-тестов-из-терминала)
- [Запуск тестов в Jenkins](#-запуск-тестов-в-jenkins)
- [Отчет о результатах тестирования в Allure Report](#-отчет-о-результатах-тестирования-в-Allure-report)
- [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)


## :technologist: Технологии и инструменты

<p align="center">
<code><a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a></code>
<code><a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a></code>
<code><a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a></code>
<code><a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a></code>
<code><a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a></code>
<code><a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a></code>
<code><a href="https://web.telegram.org/"><img src="images/logo/Telegram.svg" width="50" height="50"  alt="Telegram"/></a></code>
<code><a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a></code>
<code><a href="https://github.com/allure-framework/"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a></code>
</p>


## :bookmark_tabs: Реализованные проверки:
### UI Tests

- Проверка видимости элементов на главной странице
- Открытие и проверка страницс с содержанием
- Открытие и проверка страницы с пожертвованием
- Проверка поиска
- Проверка открытия найденой статьи
- Проверка авторизации
- Проверка открытия страницы пользователя

## :computer: Запуск тестов из терминала

### Локальный запуск тестов

```bash
gradle clean test
```

### Удаленный запуск тестов

```bash
gradle clean test
-Dbrowser=${browser}
-DbrowserVersion=${browserVersion}
-DbrowserSize=${browserSize}
-DremoteUrl=${remoteUrl}
```

## Параметры сборки


<code>browser</code> – браузер, в котором будут выполняться тесты (_по умолчанию - <code>chrome</code>_).

<code>browserVersion</code> – версия запускаемого браузера, в котором будут выполняться тесты (_по умолчанию - <code>100</code>_).

<code>browserSize</code> – размер окна браузера, в котором будут выполняться тесты (_по умолчанию - <code>1920x1080</code>_).

<code>remoteUrl</code> – адрес удаленного сервера, на котором будут запускаться тесты.

## <img width="4%" title="Jenkins" src="images/logo/Jenkins_logo.svg"> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/Khan_qa_ui_test/)

Для запуска сборки необходимо указать значения параметров и нажать кнопку <code><strong>*Собрать с параметрами*</strong></code>.

<p align="center">
  <img src="images/jenkins.png" alt="Jenkins" width="800">
</p>

После выполнения сборки, в блоке <code><strong>*История сборок*</strong></code> напротив номера сборки появится
значок *Allure Report*, кликнув по которому, откроется страница с сформированным html-отчетом.

<p align="center">
  <img src="images/jenkins-allure-report.png" alt="jenkins-allure-report" width="800">
</p>


## <img width="4%" title="Allure Report" src="images/logo/Allure.svg"> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/Khan_qa_ui_test/allure/)

<p align="center">
  <img src="images/allure1.png" alt="allure1" width="900">
</p>
<p align="center">
  <img src="images/allure2.png" alt="allure2" width="900">
</p>


## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> Уведомления в Telegram с использованием бота
После завершения сборки <code>Telegram</code> бот, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне тестов.

<p align="center">
<img title="Telegram Notifications" src="images/telegram.png">
</p>
