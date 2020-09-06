package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Михаил");
        User user2 = new User("Иван");
        User user3 = new User("Наталья");


        MessageDatabase.sendMessage(user1, user2, "Привет");
        MessageDatabase.sendMessage(user2, user1, "Привет и тебе");

        MessageDatabase.sendMessage(user3, user1, "Здравствуйте");
        MessageDatabase.sendMessage(user1, user3, "И Вам доброго дня");
        MessageDatabase.sendMessage(user1, user3, "Я документы подписал");
        MessageDatabase.sendMessage(user1, user3, "Ожидаю акцепта от Вас");
        MessageDatabase.sendMessage(user3, user1, "Хорошо. По приезду в офис. Ожидайте. Сообщу по почте");


        MessageDatabase.showDialog(user1, user3);


    }
}
