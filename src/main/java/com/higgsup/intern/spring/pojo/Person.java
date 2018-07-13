package com.higgsup.intern.spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name ;
    private int age;
    private boolean gender;
    // field injection
    private Address address;
    private Account account;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
// constructor injection
    public Person(Address address, Account account) {
        this.address = address;
        this.account = account;
    }

    public Person(Account account) {
        this.account = account;
    }

    public Person(Address address) {
        this.address = address;
    }
// getter and setter
    public String getName() {
        return name;
    }
    @Value("Thúy An")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    @Value("20")
    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }
    @Value("true") // cho true = nữ , false = nam
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    public void showInfo(){
        System.out.println("Information : ");
        System.out.println("Name : "+name +"\n"+"Age : "+age + "\n"+"Gender : "+gender+"\n"+"Address : "+address+"\n"+"Account : "+account);
    }
}
