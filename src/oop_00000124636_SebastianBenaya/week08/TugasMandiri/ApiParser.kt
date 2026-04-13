package oop_00000124636_SebastianBenaya.week08.TugasMandiri

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product?{
        try {
            val id = requireNotNull(rawJson["id"]) {"API Invalid: Missing ID"}
            val name = requireNotNull(rawJson["name"]) {"API Invalid: Missing Name"}

            val type = rawJson["type"] as? String

            return when (type) {
                "ELECTRONIC" -> {
                    val warranty = rawJson["warranty"] as? Int ?: 12
                    Electronic(id as String, name as String, warranty)
                }
                "CLOTHING" -> {
                    val size = rawJson["size"] as? String ?: "All Size"
                    Clothing(id as String, name as String, size)
                }
                else -> null
            }
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return null
        }
    }

    fun checkout(product: Product) {
        val id = when (product){
            is Electronic -> product.id
            is Clothing -> product.id
        }

        val transactionId = JavaPaymentService.processPayment(id)!!
        println("Transaction Id: $transactionId")
    }
}