package utils

class GameUtils {

    fun checkWeapon(): String? {
        var inputWeapon = readLine()
        val listWeapon = arrayListOf("kertas", "gunting", "batu")

        while (inputWeapon !in listWeapon){
            print("GAGAL INPUT. Silakan pilih batu/kertas/gunting! : ")
            inputWeapon = readLine()
        }
        return inputWeapon
    }

    fun checkWinner(firstPlayerWeapon: String, secondPlayerWeapon: String) {
        println("\nHasil : ")
        if (firstPlayerWeapon == "kertas"){
            when (secondPlayerWeapon) {
                "kertas" -> {
                    println("DRAW!")
                }
                "gunting" -> {
                    println("Pemain 2 MENANG!")
                }
                "batu" -> {
                    println("Pemain 1 MENANG!")
                }
            }
        } else if (firstPlayerWeapon == "gunting"){
            when (secondPlayerWeapon) {
                "kertas" -> {
                    println("Pemain 1 MENANG!")
                }
                "gunting" -> {
                    println("DRAW")
                }
                "batu" -> {
                    println("Pemain 2 MENANG!")
                }
            }
        } else if (firstPlayerWeapon == "batu"){
            when (secondPlayerWeapon) {
                "kertas" -> {
                    println("Pemain 2 MENANG!")
                }
                "gunting" -> {
                    println("Pemain 1 MENANG!")
                }
                "batu" -> {
                    println("DRAW")
                }
            }
        }
    }
}