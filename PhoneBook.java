import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<ArrayList>> book;

    public PhoneBook() {
        book = new HashMap<String, ArrayList<ArrayList>>();
    }

    public void add(Person p) {
        if (book.containsKey(p.getSurname())) {
            book.get(p.getSurname()).get(0).add(p.getPhoneNumber());
            book.get(p.getSurname()).get(1).add(p.getEmail());
        } else {
            ArrayList<ArrayList> personData = new ArrayList<>();
            ArrayList<String> numbers = new ArrayList<>();
            ArrayList<String> emails = new ArrayList<>();
            numbers.add(p.getPhoneNumber());
            emails.add(p.getEmail());
            personData.add(numbers);
            personData.add(emails);
            book.put(p.getSurname(), personData);
        }
    }

    public HashMap<String, ArrayList<ArrayList>> getBook() {
        return book;
    }

    public ArrayList<String> findNumber(String s) {
        if (!(book.containsKey(s))) {
            throw new UserNotFoundException("User not found");
        } else {
            return book.get(s).get(0);
        }
    }

    public ArrayList<String> findEmail(String s) {
        if (!(book.containsKey(s))) {
            throw new UserNotFoundException("User not found");
        } else {
            return book.get(s).get(1);
        }
    }

    public class UserNotFoundException extends RuntimeException {
        public UserNotFoundException(String s) {
            super(s);
        }
    }
}
