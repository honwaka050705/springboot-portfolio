import com.example.springbootportfolio.spock.FizzBazz
import spock.lang.Specification

class FizzBazzTest extends Specification {
    def "case1"() {
        setup:
        FizzBazz f = new FizzBazz()

        expect:
        f.calc(x) == ret

        where:
        x | ret
        3 | "Fizz"
        5 | "Buzz"
        15 | "Fizz Buzz"
        4 | "4"
    }
}