package com.itheima.test;

import java.util.ArrayList;

public class phone_if_less_2000 {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        Phone phone1 = new Phone("Apple", 8999);
        Phone phone2 = new Phone("Xiaomi", 7999);
        Phone phone3 = new Phone("vivo", 1500);
        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);
        ArrayList<Phone> phones_more_than_2000 = is_more_than_2000(phones);
        for(int i = 0; i < phones_more_than_2000.size(); i++){
            System.out.println(phones_more_than_2000.get(i).brand + "," + phones_more_than_2000.get(i).price);
        }
    }

    public static ArrayList<Phone> is_more_than_2000(ArrayList<Phone> phones){
        ArrayList<Phone> phones_more_than_2000 = new ArrayList<>();
        for(int i = 0; i < phones.size(); i++){
            if(phones.get(i).getPrice() > 2000) {
                phones_more_than_2000.add(phones.get(i));
            }
        }
        return phones_more_than_2000;
    }
}


