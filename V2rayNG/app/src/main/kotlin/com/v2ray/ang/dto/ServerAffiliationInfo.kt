package com.ohb.ang.dto

data class ServerAffiliationInfo(var testDelayMillis: Long = 0L) {
    fun getTestDelayString(): String {
        if (testDelayMillis == 0L) {
            return ""
        }
        return testDelayMillis.toString() + "ms"
    }
}
