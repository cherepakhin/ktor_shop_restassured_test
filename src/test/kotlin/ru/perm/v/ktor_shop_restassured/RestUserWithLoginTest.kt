package ru.perm.v.ktor_shop_restassured

import io.restassured.RestAssured
import org.apache.http.HttpStatus
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Test User with Login route")
class RestUserWithLoginTest {
    @Test
    @DisplayName("GET Request for user with login is status=200")
    fun getMessageStatusOk() {
        RestAssured.given().`when`().get(CONSTS.USER_PATH + "/USER_1").then()
            .statusCode(HttpStatus.SC_OK)
            .body(equalTo("Hello, USER_1"))
    }
}