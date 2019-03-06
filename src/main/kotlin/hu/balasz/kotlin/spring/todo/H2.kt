package hu.balasz.kotlin.spring.todo

import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

// H2 console isn't start on webflux.
@Component
class H2 {

    private var webServer: org.h2.tools.Server? = null

    private var server: org.h2.tools.Server? = null

    @EventListener(org.springframework.context.event.ContextRefreshedEvent::class)
    @Throws(java.sql.SQLException::class)
    fun start() {
        this.webServer = org.h2.tools.Server.createWebServer("-webPort", "8082", "-tcpAllowOthers").start()
        this.server = org.h2.tools.Server.createTcpServer("-tcpPort", "9092", "-tcpAllowOthers").start()
    }

    @EventListener(org.springframework.context.event.ContextClosedEvent::class)
    fun stop() {
        this.webServer!!.stop()
        this.server!!.stop()
    }

}