package oop_00000124636_SebastianBenaya.week02.tugasmandiri

class Loan(val bookTitle: String, val borrower: String, val loanDuration: Int = 1){
    fun calculateFine(){
        if(loanDuration > 3){
            val denda: Int = (loanDuration - 3) * 2000
        }else{
            val denda: Int = 0
        }
    }
}