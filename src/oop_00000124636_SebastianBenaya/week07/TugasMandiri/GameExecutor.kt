package oop_00000124636_SebastianBenaya.week07.TugasMandiri

fun processEvent(event: BattleState){
    when(event){
        is BattleState.MonsterEncounter -> println("Muncul monster: ${event.monsterName}")
        is BattleState.LootDropped -> println("Dapat item: ${event.item.name} (Damage: ${event.item.damage}, Rarity: ${event.item.rarity})")
        is BattleState.GameOver -> println("\nGame over: ${event.reason}")
        is BattleState.SafeZone -> println("Anda di dalam zona aman.")
    }
}