package tennis.kata

import spock.lang.Specification

class ScoreEngineSpec extends Specification {
    ScoreEngine scoreEngine = new ScoreEngine()

    def "should throw exception"() {
        given:
        Player p1 = new Player("p1", -1)
        Player p2 = new Player("p2", 7)
        when:
        scoreEngine.CalculateScore(p1.getPtr(), p2.getPtr())
        then:
        thrown(IllegalArgumentException)

    }

    def "both cannot be at advantage "() {
        given:
        Player p1 = new Player("p1", 4)
        Player p2 = new Player("p2", 4)
        when:
        scoreEngine.CalculateScore(p1.getPtr(), p2.getPtr())
        then:
        thrown(IllegalArgumentException)
    }

    def "both cannot be winner"() {
        given:
        Player p1 = new Player("p1", 5)
        Player p2 = new Player("p2", 5)
        when:
        scoreEngine.CalculateScore(p1.getPtr(), p2.getPtr())
        then:
        thrown(IllegalArgumentException)
    }

    def "should see expected value in table"(int a, int b, String c) {

        expect:
        scoreEngine.CalculateScore(a, b) == c
        where:
        a | b | c
        0 | 0 | "love:ALL"
        1 | 1 | "fifteen:ALL"
        2 | 2 | "thirty:ALL"
        3 | 3 | "deuce"
    }

    def "should see expected value in table"(int a, int b, String c) {
        expect:
        scoreEngine.CalculateScore(a, b) == c
        where:
        a | b | c
        0 | 1 | "love:fifteen"
        1 | 2 | "fifteen:thirty"
        2 | 3 | "thirty:forty"
        3 | 4 | "forty:advantage"
        3 | 5 | "forty:win"
        1 | 0 | "fifteen:love"
        1 | 4 | "fifteen:win"
        4 | 1 | "win:fifteen"
        2 | 4 | "thirty:win"
        4 | 3 | "advantage:forty"
    }
}
