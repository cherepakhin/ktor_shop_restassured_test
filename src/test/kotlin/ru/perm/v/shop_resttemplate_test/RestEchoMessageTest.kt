package ru.perm.v.shop_resttemplate_test


import io.restassured.RestAssured
import org.apache.http.HttpStatus
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


@DisplayName("Test Route Message")
class RestEchoMessageTest {

    @Test
    @DisplayName("GET Request /message is status=200")
    fun getMessageStatusOk() {
        val MESSAGE = "TEST"

        RestAssured.given().`when`().get(CONSTS.ECHO_PATH + "/" + MESSAGE).then()
            .statusCode(HttpStatus.SC_OK)
    }

    @Test
    @DisplayName("GET Request with message is status=200")
    fun getMessage_CheckMessage() {
        val MESSAGE = "TEST"

        val response = RestAssured.given().`when`().get(CONSTS.ECHO_PATH + "/" + MESSAGE)

        val responseBody = response.asString()
        Assertions.assertEquals(MESSAGE, responseBody)
    }

//    @BeforeSuite
//    fun setAllureEnvironment(): Unit {
//        allureEnvironmentWriter(ImmutableMap.of("CPU", "Intel Core i3"))
//        allureEnvironmentWriter(
//            ImmutableMap.builder<String, String>()
//                .put("CPU", "Intel Core i3")
//                .put("URL", "http://v.perm.ru")
//                .build()
//        )
//    }
}