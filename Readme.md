### Интеграционное тестирование на Kotlin проекта shop_kotlin 

[https://github.com/cherepakhin/shop_kotlin](https://github.com/cherepakhin/shop_kotlin)

Использован [https://rest-assured.io/](https://rest-assured.io/)

Для просмотра отчетов Allure [https://docs.qameta.io/allure/](https://docs.qameta.io/allure/)

Скрипты выполнять из папки проекта с тестами Rest Assured.
Перед запуском тестов нужно запустить сам проект:
[https://github.com/cherepakhin/ktor_shop](https://github.com/cherepakhin/ktor_shop)

Константы (адрес сервиса, REST пути и т.п.) заданы в [CONST.kt](https://github.com/cherepakhin/ktor_shop_restassured_test/blob/main/src/test/kotlin/ru/perm/v/shop_resttemplate_test/CONSTS.kt):

````kotlin
package ru.perm.v.shop_resttemplate_test

class CONSTS {
    companion object {
        val ROOT = "http://127.0.0.1:9080"
        val ECHO_PATH = ROOT + "/echo"
    }
}
````

SHOP_KOTLIN_IP - адрес и порт сервиса. По умолчанию: __127.0.0.1:9080__. Установка переменных:

````shell
$ export SHOP_KOTLIN_IP=192.168.1.57:9080
$ echo $SHOP_KOTLIN_IP
192.168.1.57:9080
````

Запуск тестов:

````shell
ktor_shop_restassured_test$ ./gradlew test
````

Отчет о тестирован сформирована в формате Allure Report. Просмотр результатов: 

````shell
ktor_shop_restassured_test$ allure serve build/allure-results/
````
