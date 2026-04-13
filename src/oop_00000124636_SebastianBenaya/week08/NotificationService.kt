package oop_00000124636_SebastianBenaya.week08

class NotificationService {
    fun sendEmail(emailAddress: String){
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile){
        // sendEmail(user.email)
        if(user.email != null){
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}