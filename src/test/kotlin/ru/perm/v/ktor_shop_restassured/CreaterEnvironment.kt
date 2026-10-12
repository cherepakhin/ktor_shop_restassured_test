package ru.perm.v.ktor_shop_restassured

import org.junit.jupiter.api.Test
import java.io.File
import java.lang.String.format
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption


class CreaterEnvironment {
    @Test
    fun copyFileEnvironmnet() {
        //TODO: change to real resources (cpu, ram, host, ip, version project, group, artifact)
        val envSrc = Path.of("src/test/resources/environment.properties")
        val envTarget = Path.of("build/allure-results/environment.properties")
        Files.copy(envSrc, envTarget, StandardCopyOption.REPLACE_EXISTING)
    }

    @Test
    fun getEnv() {
        val props = System.getProperties()
        props.keys.stream().forEach { p -> println(format("%s:\t%s", p.toString(), props.getProperty(p.toString()))) }
        println("------------------------------")
//        println(System.getenv().keys)
//        val total = Runtime.getRuntime().totalMemory()
        println("Memory total: ${Runtime.getRuntime().totalMemory()}")
        println("Memory free: ${Runtime.getRuntime().freeMemory()}")
        println("MaxMemory: ${Runtime.getRuntime().maxMemory()}")
        println("AvailableProcessors: ${Runtime.getRuntime().availableProcessors()}")
        val cpu = File("/proc/cpuinfo").readLines()
        println("-------------CPU--------------")
        for (i in cpu) {
            println(i)
        }
//      model name	: Intel(R) Core(TM) i7-2640M CPU @ 2.80GHz
        val mem = File("/proc/meminfo").readLines()
        println("--------------MEM-------------")
        for (i in mem) {
            println(i)
        }

//      --------------MEM-------------
//      MemTotal:       16293328 kB
//      MemFree:          392036 kB
//      MemAvailable:    1140452 kB
    }
}