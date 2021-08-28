import utils.GameUtils
import utils.PlayerNameUtils
import kotlin.system.exitProcess

class App {
    private var game = GameUtils()
    private val firstPlayer = Player()
    private val secondPlayer = Player()

    companion object{
        private lateinit var player: PlayerNameUtils
        @JvmStatic
        fun main(args: Array<String>){
            App().start()
        }
    }

    private fun start(){
        player = PlayerNameUtils()
        printHeader()
        inputName()
        inputWeapon()
        theWinner()
        playAgain()
    }

    private fun printHeader(){
        print("\n")
        println("""
            ==========================
            GAME SUIT TERMINAL VERSION
            ==========================
        """.trimIndent()
        )
    }

    private fun inputName(){
        print("Masukkan Nama Pemain 1 = ")
        val firstPlayerName = readLine().orEmpty()
        print("Masukkan Nama Pemain 2 = ")
        val secondPlayerName = readLine().orEmpty()
        println("\n${player.getName(firstPlayerName.toUpperCase())} (PEMAIN 1) " +
                "vs ${player.getName(secondPlayerName.toUpperCase())} (PEMAIN 2)")
    }

    private fun inputWeapon(){
        print("1. Masukkan Pemain 1 : ")
        firstPlayer.weapon = game.checkWeapon().toString()
        print("2. Masukkan Pemain 2 : ")
        secondPlayer.weapon = game.checkWeapon().toString()
    }

    private fun theWinner(){
        val winner = game.checkWinner(firstPlayer.weapon, secondPlayer.weapon)
        print(winner)
    }

    private fun playAgain() {
        println("\n\nPlay Again? (Y/N)")
        if (readLine().equals("y", ignoreCase = true)) {
            start()
        } else {
            exitProcess(0)
        }
    }
}


