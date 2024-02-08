package ru.perm.v.shop_resttemplate_test

import org.junit.jupiter.api.Test
import java.nio.file.Files
import java.nio.file.Path


class CreaterEnvironment {
    @Test
    fun copyFileEnvironmnet() {
        //TODO: change to real resources (cpu, ram, host, ip, version project, group, artifact)
        val envSrc = Path.of("src/test/resources/environment.properties")
        val envTarget = Path.of("build/allure-results/environment.properties")
        Files.copy(envSrc, envTarget)
    }
}