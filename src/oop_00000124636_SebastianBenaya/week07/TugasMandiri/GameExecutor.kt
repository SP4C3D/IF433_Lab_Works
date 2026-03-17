package oop_00000124636_SebastianBenaya.week07.TugasMandiri

fun processEvent(event: BattleState){
    when(event){
        is BattleState.MonsterEncounter -> "Muncul monster: ${event.monsterName}"
        is BattleState.LootDropped -> "Dapat item: ${event.item.name} (Damage: ${event.item.damage}, Rarity: ${event.item.rarity}"
        is BattleState.GameOver -> "Game over: ${event.reason}"
        is BattleState.SafeZone -> "Anda di dalam zona aman."
    }
}