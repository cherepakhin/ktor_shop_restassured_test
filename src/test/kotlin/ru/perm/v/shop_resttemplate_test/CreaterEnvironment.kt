package ru.perm.v.shop_resttemplate_test

import org.junit.jupiter.api.Test
import java.nio.file.Files
import java.nio.file.Path


class CreaterEnvironment {
    @Test
    fun copyFileEnvironmnet() {
        val envSrc = Path.of("src/test/resources/environment.properties")
        val envTarget = Path.of("build/allure-results/environment.properties")
        Files.copy(envSrc, envTarget)
    }
}