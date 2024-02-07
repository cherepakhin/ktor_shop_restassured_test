package ru.perm.v.shop_resttemplate_test

class CONSTS {
    companion object {
        val IP = System.getenv("KTOR_SHOP_IP") ?: "127.0.0.1:9080"
        val ROOT = "http://" + IP
        val ECHO_PATH = ROOT + "/echo"
    }
}