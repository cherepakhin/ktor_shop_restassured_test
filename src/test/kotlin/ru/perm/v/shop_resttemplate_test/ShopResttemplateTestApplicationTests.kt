package ru.perm.v.shop_resttemplate_test

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ShopResttemplateTestApplicationTests {

	@Test
	fun contextLoads() {
		val b = true;
		Assertions.assertEquals(true, b)
	}

}
