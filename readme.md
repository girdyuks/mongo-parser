# Функционал проекта
Основная задача данного проекта - использование SQL запросов для NoSQL баз данных (в данном случае, mongoDB).
Ограничение запросов - 

`SELECT [<Projections>] [FROM <Target>]
 [WHERE <Condition>*]
 [ORDER BY <Fields>* [ASC|DESC] *]
 [LIMIT <MaxRecords>]`
 
 где Projections может быть формата - `*`, `field`, `field.subfield`, `field.*`,
 Conditions - `=, <>, >, >=, <, <=`
 
 Особенности : 
 1. Отсутствует валидация шаблона входного значения
 2. При любых значениях `Projections` будет возвращено поле с _id
 
# Структура проекта
Архитектура проекта представляет из себя 2 уровня - уровень контроллеров (директория `controller`)
и уровень бизнес логики (директории `service` и `util`)

Основные настройки (путь к базе данных и пр.) находятся в файле `application.properties`

## Зависимости проекта
Перечень всех зависимостей можно найти в файле `build.gradle` в корне проекта.
  
## Запуск приложения и основные команды
Все действия с приложения производятся через gradle. Для выполнения команд можно использовать как предустановленный gradle, 
так и скрипты внутри приложения через `.\gradlew.bat <command>`. 
Краткий список вариантов `<command>`: 
* build - сборка приложения
* jar - сборка приложения и упаковка в jar
* war - сборка приложения и упаковка в war
* test - запуск тестов
* bootRun - запуск приложения посредством spring-boot (порт 8080)

После запуска сервиса будет доступен end-point `GET /execute-sql` с обязательным параметром запроса `request` 