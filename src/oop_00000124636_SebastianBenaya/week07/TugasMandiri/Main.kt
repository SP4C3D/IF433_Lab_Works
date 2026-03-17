package oop_00000124636_SebastianBenaya.week07.TugasMandiri

fun main(){
    GameManager.startGame()
    GameManager.startGame()

    println("Drop chance item legendary adalah ${ItemRarity.LEGENDARY.dropChance}%")
    val senjata = Weapon.forgeStarterSword()

    println("\nAnda mendapatkan ${senjata.item.name} (Damage: ${senjata.item.damage}, Durability: ${senjata.durability}, Rarity: ${senjata.item.rarity})")
}