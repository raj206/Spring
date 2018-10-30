package sbkd.SpringBootKotlinDemo



import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

/**
 * This class has a dependency on HotelRepository. We can declare that
 * dependency in the primary constructor and it will be injected
 * at runtime
 */
@Component
class DbSeeder(val hotelRepository: HotelRepository) : CommandLineRunner {
    override fun run(vararg p0: String?) {
        this.hotelRepository.deleteAll()

        val ibis = Hotel("Ibis", 3, 30)
        val intercontinental = Hotel("Intercontinental", 5, 90)
        val goldenTulip = Hotel(name="Golden Tulip", classification = 4, nbRooms = 40)

        this.hotelRepository.save(ibis)
        this.hotelRepository.save(intercontinental)
        this.hotelRepository.save(goldenTulip)
        println(" -- Database has been initialized")
    }
}