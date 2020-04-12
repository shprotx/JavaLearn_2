public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Person invanov = new Person("Ivanov", "+79995553344", "ivanov@mail.ru");
        Person petrov = new Person("Petrov", "+79880805566", "petrov@mail.ru");
        Person sidorov = new Person("Sidorov", "+79044446699", "sidorov@mail.ru");
        Person invanov1 = new Person("Ivanov", "+79958887733", "ivanov1@gmail.com");
        phoneBook.add(invanov);
        phoneBook.add(petrov);
        phoneBook.add(sidorov);
        phoneBook.add(invanov1);
        System.out.println(phoneBook.getBook());
        System.out.println(phoneBook.findNumber("Ivanov"));
        System.out.println(phoneBook.findEmail("Sidorov"));
        System.out.println(phoneBook.findNumber("Putin"));
    }
}
