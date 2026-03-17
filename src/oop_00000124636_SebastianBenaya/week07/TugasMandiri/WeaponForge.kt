package oop_00000124636_SebastianBenaya.week07.TugasMandiri

private class Weapon(val item: GameItem, val durability: Int){
    companion object{
        fun forgeStarterSword(): Weapon{
            val item = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(item, 50)
        }
        fun forgeEpicSword(): Weapon{
            val item = GameItem("Claymore", 50, ItemRarity.EPIC)
            return Weapon(item, 100)
        }
    }
}