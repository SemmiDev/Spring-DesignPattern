package com.sammidev.facade;

public class StudentRepoImplement implements StudentRepository {
    @Override
    public void sayHi() {
        System.out.println("hai");
    }

    @Override
    public void sayHello() {
        System.out.println("hello");
    }

    @Override
    public void sayP() {
        System.out.println("p");
    }
}
