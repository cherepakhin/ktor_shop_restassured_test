### Интеграционное тестирование на Kotlin проекта ktor_shop 

Исходный код __тестируемого__ проекта [https://github.com/cherepakhin/ktor_shop](https://github.com/cherepakhin/ktor_shop).
Перед запуском тестов нужно запустить сам проект.

Использован [https://rest-assured.io/](https://rest-assured.io/)

Для просмотра отчетов Allure [https://docs.qameta.io/allure/](https://docs.qameta.io/allure/)

Скрипты выполнять из папки этого проекта.

Константы (адрес сервиса, REST пути и т.п.) заданы в [CONST.kt](https://github.com/cherepakhin/ktor_shop_restassured_test/blob/main/src/test/kotlin/ru/perm/v/shop_resttemplate_test/CONSTS.kt):

````kotlin
package ru.perm.v.shop_resttemplate_test

class CONSTS {
    companion object {
        val IP = System.getenv("KTOR_SHOP_IP") ?: "127.0.0.1:9080"
        val ROOT = "http://" + IP
        val ECHO_PATH = ROOT + "/echo"
    }
}
````

__KTOR_SHOP_IP__ - адрес и порт сервиса. По умолчанию: __127.0.0.1:9080__. 
Установка переменных:

````shell
$ export KTOR_SHOP_IP=192.168.1.57:9080
$ echo $KTOR_SHOP_IP
192.168.1.57:9080
````

Запуск тестов [./run_tests.sh](./run_tests.sh)

````shell
ktor_shop_restassured_test$ ./gradlew test --rerun
````
Флаг __--rerun__ позволяет запустить тесты, которые уже были запущены раннее. 
Это не unit тесты, а интеграционные, этот проект ничего не знает о том, что изменилось на тестируемом проекте и поэтому нужно запускать их заново. 

Рекомендуется сначала запустить все тесты при __незапущенном__ тестируемом проекте, чтобы убедиться что тесты падают.

Отчет о результатах тестирования сформирован в формате Allure Report. Просмотр результатов: 

````shell
ktor_shop_restassured_test$ allure serve build/allure-results/
````
