package lesson5

const val USER_LOG = "Batman"
const val USER_PASS = "password"
fun main() {
    print("Введите логин: ")
    val userInputLogin = readlnOrNull()
    if (userInputLogin == USER_LOG) {
        print("Введите пароль: ")
        val userInputPassword = readlnOrNull()
        if (userInputPassword == USER_PASS) print("Добро пожаловать, $userInputLogin!")
        else print("Ошибка авторизации, проверить правильность введеного пароля")
    } else (print("Такого пользователя не существует, Вам нужно зарегистрироваться."))
}