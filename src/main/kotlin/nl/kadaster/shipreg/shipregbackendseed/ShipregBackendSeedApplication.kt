package nl.kadaster.shipreg.shipregbackendseed

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ShipregBackendSeedApplication

fun main(args: Array<String>) {
	runApplication<ShipregBackendSeedApplication>(*args)
}
