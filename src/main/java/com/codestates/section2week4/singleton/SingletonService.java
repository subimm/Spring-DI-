package com.codestates.section2week4.singleton;

public class SingletonService {

    //1. static 영역에 객체를 딱 1개만 생성
    private static final SingletonService instance = new SingletonService();

    //2. 객체 인스턴스가 필요하면 아래 public static메서드를 통해서만 조회할 수 있도록 함.
    public static SingletonService getInstance() {
        return instance;
    }

    //3. 생성자를 private로 선언하여 외부에서 new 키워드를 통해 객체를 생성할 수 없도록 한다.
    private SingletonService(){}
}
