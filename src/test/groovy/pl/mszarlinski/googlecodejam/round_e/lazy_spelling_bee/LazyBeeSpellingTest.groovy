import pl.mszarlinski.googlecodejam.round_e.lazy_spelling_bee.LazyBeeSpelling
import spock.lang.Unroll

/**
 * @autor mszarlinski
 */
class LazyBeeSpellingTest extends spock.lang.Specification {

    @Unroll('Should find solution for #word')
    def "should find soultion"() {
        given:
            def lazyBeeSpelling = new LazyBeeSpelling();
        when:
            def result = lazyBeeSpelling.solution(word)
        then:
           result == expected
        where:
            word    | expected
            'ag'    | 4
            'aa'    | 1
            'abcde' | 108
            'x'     | 1
    }
}
