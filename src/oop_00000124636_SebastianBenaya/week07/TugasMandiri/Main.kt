package oop_00000124636_SebastianBenaya.week07.TugasMandiri

fun main(){
    GameManager.startGame()
    GameManager.startGame()

    println("Drop chance item legendary adalah ${ItemRarity.LEGENDARY.dropChance}%")
    val senjata = Weapon.forgeStarterSword()

    println("\nAnda mendapatkan ${senjata.item.name} (Damage: ${senjata.item.damage}, Durability: ${senjata.durability}, Rarity: ${senjata.item.rarity})")

    val senjataBaru = senjata.item.copy(damage = 25)

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal Bahlil"))
    processEvent(BattleState.LootDropped(senjataBaru))
    processEvent(BattleState.GameOver("Terkena jebakan racun munir"))
}