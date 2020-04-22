package HW0203;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phonebook = new HashMap<>();

    public void add(String name, String phone){
        ArrayList<String> astr = new ArrayList<>();
        if (phonebook.containsKey(name)) {
            astr = phonebook.get(name);
            astr.add(phone);
            phonebook.put(name, astr);
        } else {
            astr.clear();
            astr.add(phone);
            phonebook.put(name, astr);
        }

    }
    public String get(String name){
        return phonebook.get(name).toString();
    }
}
