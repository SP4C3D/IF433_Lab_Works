package oop_00000124636_SebastianBenaya.week07.TugasMandiri

enum class ItemRarity (val dropChance: Int){
    COMMON(70), UNCOMMON(50), RARE(30), EPIC(10), LEGENDARY(1)
}

data class GameItem (val name: String, val damage: Int, val rarity: ItemRarity)

