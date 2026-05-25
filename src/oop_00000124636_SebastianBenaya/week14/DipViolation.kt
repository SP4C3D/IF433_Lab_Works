package oop_00000124636_SebastianBenaya.week14

class MySQLDatabase {
    fun query(sql: String): List<String> = listOf("data1", "data2")
}

class SafeUserService(private val db: Database) {
    fun getUser(id: Int) = db.query(("SELECT * FROM users WHERE id =$id"))
}