package ru.perm.v.ktor_shop_restassured

import io.restassured.RestAssured
import org.apache.http.HttpStatus
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Test Root route")
class RestRootTest {
    @Test
    @DisplayName("GET Request for '/' is status=200 and body='From root'")
    fun getMessageStatusOk() {
        RestAssured.given().`when`().get(CONSTS.ROOT_PATH).then()
            .statusCode(HttpStatus.SC_OK).body(equalTo("From root"))
    }
}