package oop_00000124636_SebastianBenaya.week08.TugasMandiri

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parse = ApiParser()

    for (raw in rawApiData) {
        try {
            val product = parse.parseProduct(raw)
            product?.let {
                parse.checkout(it)
            }
        } catch (e: IllegalArgumentException){
            println(e.message)
        }
    }
}


