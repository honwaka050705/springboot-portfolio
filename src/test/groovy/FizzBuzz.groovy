import com.example.springbootportfolio.spock.FizzBuzz
import spock.lang.Specification

class FizzBuzzTest extends Specification {
    def "case1"() {
        setup:
        FizzBuzz f = new FizzBuzz()

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