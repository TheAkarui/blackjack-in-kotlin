
import src.main.kotlin.Card
import src.main.kotlin.Player
fun main(args: Array<String>) {
    val deck = Card.createDeck()

    print("Deck criado: ")
    for (card in deck) {
        print("$card ")
    }

    val newPlayer = Player(100)

    newPlayer.setName("Anniely")
    newPlayer.placeBet(10)
    newPlayer.hit(deck);
    newPlayer.doubleDown(deck);

}
