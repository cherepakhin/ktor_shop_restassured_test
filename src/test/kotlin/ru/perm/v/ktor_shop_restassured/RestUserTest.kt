package ru.perm.v.ktor_shop_restassured

import io.restassured.RestAssured
import org.apache.http.HttpStatus
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Test User route")
class RestUserTest {
    @Test
    @DisplayName("GET Request for user empty is status=200")
    fun getMessageStatusOk() {
        RestAssured.given().`when`().get(CONSTS.USER_PATH).then()
            .statusCode(HttpStatus.SC_OK).body(equalTo("Empty login"))
    }
}