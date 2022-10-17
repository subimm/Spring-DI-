package com.codestates.section2week4.coffee;

import com.codestates.section2week4.DependencyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CoffeeTest {
    public static void main(String[] args) {

        ApplicationContext ac = new AnnotationConfigApplicationContext(DependencyConfig.class);
        CoffeeService coffeeService = ac.getBean("coffeeService", CoffeeService.class);

        Coffee coffee = new Coffee(0L, "아메리카노", "americano", 3000 );
        coffeeService.createCoffee(coffee);

        if(coffeeService.getCoffee(0L).getKorName().equals(coffee.getKorName())) {
            System.out.println("아메리카노가 등록되었습니다.");
        }

        coffeeService.editCoffee(0L, "아메리카노", 4000);

        if(coffeeService.getCoffee(0L).getPrice() == 4000) {
            System.out.println("아메리카노의 금액이 정상적으로 변경되었습니다.");
        }

        coffeeService.deleteCoffee(0L);

        if(coffeeService.getCoffee(0L) == null) {
            System.out.println("아메리카노가 정상적으로 삭제되었습니다.");
        }
    }
}
