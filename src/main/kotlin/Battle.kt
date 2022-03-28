
class Dice {
    fun throws(): Int {
        val DiceValues = listOf(1,2,3,4,5,6)
        return DiceValues.random()
    }

}
//Units//

class Infantry {
  val DefenseValue = 2
  val AttackValue = 1
}

class BattleStrip {
    private val Attackers: MutableList<Infantry> = mutableListOf()
    private val Defenders: MutableList<Infantry> = mutableListOf()

    fun addAttacker(attacker: Infantry) {
      Attackers.add(attacker)
    }

    fun attackers(): List<Infantry> {
        return Attackers
    }

    fun addDefender(defender: Infantry) {
       Defenders.add(defender)
    }

    fun defenders():List<Infantry> {
        return Defenders
    }
}
